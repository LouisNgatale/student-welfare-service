package com.louisngatale.studentwelfareservice.services;

import com.louisngatale.studentwelfareservice.entities.AppUser.User;
import com.louisngatale.studentwelfareservice.entities.Welfare.Conversations;
import com.louisngatale.studentwelfareservice.models.responses.Advices.AllMessagesResponse;
import com.louisngatale.studentwelfareservice.models.responses.Advices.SingleMessageResponse;
import com.louisngatale.studentwelfareservice.models.responses.SingleResponse;
import com.louisngatale.studentwelfareservice.repositories.AppUser.UserDao;
import com.louisngatale.studentwelfareservice.repositories.Welfare.ConversationsDao;
import com.louisngatale.studentwelfareservice.repositories.Welfare.MessagesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AdvicesService {
    @Autowired
    UserDao userDao;

    @Autowired
    ConversationsDao conversationsDao;

    @Autowired
    MessagesDao messagesDao;

    public Object getMessagesForStudent() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        Optional<User> user1 = userDao.findByLoginId(username);
        User user = user1.get();

        Optional<Conversations> conversation = conversationsDao.findByStudentId(user.getId());

        if (conversation.isEmpty()){
            Conversations newConversation = new Conversations(user.getId());
            conversationsDao.save(newConversation);
            return new  SingleResponse("Success","New conversation created");
        }else {
            List<SingleMessageResponse> message = new ArrayList<>();
            messagesDao.findAll()
                    .forEach(item -> {
                        message.add(new SingleMessageResponse(item.getId(),
                                item.getMessageBody(),item.getSentBy(),
                                item.isSentByStudent(),item.getSentAt()));
                    });

            return new AllMessagesResponse(message);
        }

    }
}
