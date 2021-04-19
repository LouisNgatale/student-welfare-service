package com.louisngatale.studentwelfareservice.models.responses.Advices;

import java.util.ArrayList;
import java.util.List;

public class AllMessagesResponse {
    private Integer conversationId;

    List<SingleMessageResponse> allMessages = new ArrayList<>();

    public AllMessagesResponse(List<SingleMessageResponse> allMessages) {
        this.allMessages = allMessages;
    }

    public AllMessagesResponse(Integer conversationId, List<SingleMessageResponse> allMessages) {
        this.conversationId = conversationId;
        this.allMessages = allMessages;
    }

    public List<SingleMessageResponse> getAllMessages() {
        return allMessages;
    }

    public void setAllMessages(List<SingleMessageResponse> allMessages) {
        this.allMessages = allMessages;
    }

    public Integer getConversationId() {
        return conversationId;
    }

    public void setConversationId(Integer conversationId) {
        this.conversationId = conversationId;
    }
}
