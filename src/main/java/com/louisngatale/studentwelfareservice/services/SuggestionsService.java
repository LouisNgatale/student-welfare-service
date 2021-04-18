package com.louisngatale.studentwelfareservice.services;

import com.louisngatale.studentwelfareservice.entities.AppUser.User;
import com.louisngatale.studentwelfareservice.entities.Welfare.Suggestions;
import com.louisngatale.studentwelfareservice.models.requests.NewSuggestionRequest;
import com.louisngatale.studentwelfareservice.models.responses.AllSuggestionsResponse;
import com.louisngatale.studentwelfareservice.models.responses.SuggestionsResponse;
import com.louisngatale.studentwelfareservice.repositories.AppUser.UserDao;
import com.louisngatale.studentwelfareservice.repositories.Welfare.SuggestionsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SuggestionsService {
    @Autowired
    SuggestionsDao suggestionsDao;

    @Autowired
    private UserDao userDao;

    public NewSuggestionRequest create(NewSuggestionRequest request){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        Optional<User> user1 = userDao.findByLoginId(username);
        User user = user1.get();

        Suggestions suggestion = new Suggestions(user.getId(),request.getTitle(),request.getMessage());

        suggestionsDao.save(suggestion);
        return request;
    }

    public AllSuggestionsResponse getStudentsSuggestions(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        Optional<User> user1 = userDao.findByLoginId(username);
        User user = user1.get();

        List<Suggestions> suggestions = suggestionsDao.findByPlacedBy(user.getId());
        List<SuggestionsResponse> responses = new ArrayList<>();

        suggestions.forEach(item ->{
            responses.add(new SuggestionsResponse(item.getId(),item.getTitle(),item.getBody(),item.getStatus(),item.getCreatedAt()));
        });
        return new AllSuggestionsResponse(responses);
    }
}
