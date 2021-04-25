package com.louisngatale.studentwelfareservice.models.requests;

public class RulesRequest {
    private String title;

    private String category;

    private String body;

    public RulesRequest() {
    }

    public RulesRequest(String title, String category, String body) {
        this.title = title;
        this.category = category;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
