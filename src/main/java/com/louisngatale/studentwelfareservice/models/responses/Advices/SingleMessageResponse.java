package com.louisngatale.studentwelfareservice.models.responses.Advices;

import java.util.Date;

public class SingleMessageResponse {
    private Integer id;

    private String messageBody;

    private Integer sentBy;

    private boolean sentByStudent;

    private Date sentAt;

    public SingleMessageResponse(Integer id, String messageBody, Integer sentBy, boolean sentByStudent, Date sentAt) {
        this.id = id;
        this.messageBody = messageBody;
        this.sentBy = sentBy;
        this.sentByStudent = sentByStudent;
        this.sentAt = sentAt;
    }

    public SingleMessageResponse() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public Integer getSentBy() {
        return sentBy;
    }

    public void setSentBy(Integer sentBy) {
        this.sentBy = sentBy;
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
