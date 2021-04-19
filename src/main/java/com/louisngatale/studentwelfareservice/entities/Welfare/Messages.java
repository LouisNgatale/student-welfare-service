package com.louisngatale.studentwelfareservice.entities.Welfare;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Messages {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String messageBody;

    private Integer sentBy;

    private boolean sentByStudent;

    @Column(name = "sentAt",columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private Date sentAt;

    public Messages() {
    }

    @ManyToOne
    private Conversations conversations;

    public Messages(String messageBody, Integer sentBy, boolean sentByStudent,  Conversations conversations) {
        this.messageBody = messageBody;
        this.sentBy = sentBy;
        this.sentByStudent = sentByStudent;
        this.conversations = conversations;
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

    public Conversations getConversations() {
        return conversations;
    }

    public void setConversations(Conversations conversations) {
        this.conversations = conversations;
    }
}