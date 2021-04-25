package com.louisngatale.studentwelfareservice.services;

import com.louisngatale.studentwelfareservice.entities.AppUser.User;
import com.louisngatale.studentwelfareservice.entities.Welfare.Conversations;
import com.louisngatale.studentwelfareservice.entities.Welfare.Messages;
import com.louisngatale.studentwelfareservice.models.requests.Advices.AdvicesRequest;
import com.louisngatale.studentwelfareservice.models.responses.Advices.AllConversations;
import com.louisngatale.studentwelfareservice.models.responses.Advices.AllMessagesResponse;
import com.louisngatale.studentwelfareservice.models.responses.Advices.SingleConversation;
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
import java.util.Comparator;
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
            return getObject(conversation);
        }
    }

    public Object createNewMessage(AdvicesRequest advicesRequest) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        Optional<User> user1 = userDao.findByLoginId(username);
        User user = user1.get();

        boolean isStudent = user.getRoles().stream().anyMatch(role -> role.getRole().equals("STUDENT"));

        Optional<Conversations> conversationId = conversationsDao.findById(advicesRequest.getConversationId());

        if (conversationId.isPresent()) {
            Messages message = new Messages(advicesRequest.getMessageBody(),
                    user.getId(),
                    isStudent,
                    conversationId.get());

            Messages savedMessage = messagesDao.save(message);

            return new SingleMessageResponse(savedMessage.getId(),
                    savedMessage.getMessageBody(),
                    savedMessage.getSentBy(), savedMessage.isSentByStudent(),
                    savedMessage.getSentAt());
        }

        return new SingleResponse("Error","This conversation doesn't exist");
    }

    public AllConversations getConversations() {
        List<Conversations> all = conversationsDao.findAll();
        List<SingleConversation> conversations = new ArrayList<>();

        all.forEach(item -> {
            Messages message = messagesDao.findByConversationsId(item.getId())
                    .stream()
                    .sorted(Comparator.comparing(Messages::getSentAt).reversed())
                    .findFirst().get();

            String loginId = userDao.findById(item.getStudentId()).get().getLoginId();
            conversations.add(new SingleConversation(loginId,message.getMessageBody(),item.getId()));
        });
        return  new AllConversations(conversations);
    }

    public Object getMessageById(Integer id) {

        Optional<Conversations> conversation = conversationsDao.findById(id);

        if (conversation.isEmpty()){
            return new  SingleResponse("Warning","No messages for this conversation");
        }else {
            return getObject(conversation);
        }
    }

    private Object getObject(Optional<Conversations> conversation) {
        List<SingleMessageResponse> message = new ArrayList<>();

        messagesDao.findAll()
                .stream()
                .sorted(Comparator.comparing(Messages::getSentAt))
                .forEach(item -> {
                    message.add(new SingleMessageResponse(item.getId(),
                            item.getMessageBody(),item.getSentBy(),
                            item.isSentByStudent(),item.getSentAt()));
                });

        return new AllMessagesResponse(conversation.get().getId(),message);
    }
}
