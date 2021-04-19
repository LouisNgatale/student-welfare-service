package com.louisngatale.studentwelfareservice.models.responses.Advices;

import java.util.ArrayList;
import java.util.List;

public class AllMessagesResponse {
    List<SingleMessageResponse> allMessages = new ArrayList<>();

    public AllMessagesResponse(List<SingleMessageResponse> allMessages) {
        this.allMessages = allMessages;
    }

    public List<SingleMessageResponse> getAllMessages() {
        return allMessages;
    }

    public void setAllMessages(List<SingleMessageResponse> allMessages) {
        this.allMessages = allMessages;
    }
}
