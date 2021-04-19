package com.louisngatale.studentwelfareservice.entities.Welfare;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Messages {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String messageBody;

    private Integer sentBy;

    private boolean sentByStudent;

    private Date sentAt;

    public Messages() {
    }

    public Messages(String messageBody, Integer sentBy, boolean sentByStudent, Date sentAt) {
        this.messageBody = messageBody;
        this.sentBy = sentBy;
        this.sentByStudent = sentByStudent;
        this.sentAt = sentAt;
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