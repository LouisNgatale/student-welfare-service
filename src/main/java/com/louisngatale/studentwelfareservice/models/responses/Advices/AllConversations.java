package com.louisngatale.studentwelfareservice.models.responses.Advices;

import java.util.ArrayList;
import java.util.List;

public class AllConversations {
    List<SingleConversation> conversations = new ArrayList<>();

    public AllConversations() {
    }

    public AllConversations(List<SingleConversation> conversations) {
        this.conversations = conversations;
    }

    public List<SingleConversation> getConversations() {
        return conversations;
    }

    public void setConversations(List<SingleConversation> conversations) {
        this.conversations = conversations;
    }
}
