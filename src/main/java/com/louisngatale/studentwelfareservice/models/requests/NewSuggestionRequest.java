package com.louisngatale.studentwelfareservice.models.requests;

public class NewSuggestionRequest {
    private String title;
    private String message;
    private String category;

    public NewSuggestionRequest() {
    }

    public NewSuggestionRequest(String title, String message, String category) {
        this.title = title;
        this.message = message;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
