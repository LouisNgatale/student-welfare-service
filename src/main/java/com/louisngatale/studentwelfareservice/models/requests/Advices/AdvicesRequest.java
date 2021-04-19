package com.louisngatale.studentwelfareservice.models.requests.Advices;

import java.util.Date;

public class AdvicesRequest {
    private Integer conversationId;

    private String messageBody;

    private boolean sentByStudent;

    private Date sentAt;

    public AdvicesRequest() {
    }

    public Integer getConversationId() {
        return conversationId;
    }

    public AdvicesRequest(Integer conversationId, String messageBody, boolean sentByStudent, Date sentAt) {
        this.conversationId = conversationId;
        this.messageBody = messageBody;
        this.sentByStudent = sentByStudent;
        this.sentAt = sentAt;
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

    public boolean isSentByStudent() {
        return sentByStudent;
    }

    public void setSentByStudent(boolean sentByStudent) {
        this.sentByStudent = sentByStudent;
    }

    public Date getSentAt() {
        return sentAt;
    }

    public void setSentAt(Date sentAt) {
        this.sentAt = sentAt;
    }
}
