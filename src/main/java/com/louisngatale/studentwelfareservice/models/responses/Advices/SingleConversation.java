package com.louisngatale.studentwelfareservice.models.responses.Advices;

public class SingleConversation {
    private String studentId;
    private String lastMessage;
    private Integer conversationId;

    public SingleConversation() {
    }

    public SingleConversation(String studentId, String lastMessage, Integer conversationId) {
        this.studentId = studentId;
        this.lastMessage = lastMessage;
        this.conversationId = conversationId;
    }

    public Integer getConversationId() {
        return conversationId;
    }

    public void setConversationId(Integer conversationId) {
        this.conversationId = conversationId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}
