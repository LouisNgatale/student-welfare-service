package com.louisngatale.studentwelfareservice.models.requests.Advices;

import java.util.Date;

public class AdvicesRequest {
    private Integer conversationId;

    private String messageBody;

    public AdvicesRequest() {
    }

    public Integer getConversationId() {
        return conversationId;
    }

    public AdvicesRequest(Integer conversationId, String messageBody) {
        this.conversationId = conversationId;
        this.messageBody = messageBody;
    }

    public void setConversationId(Integer conversationId) {
        this.conversationId = conversationId;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
}
