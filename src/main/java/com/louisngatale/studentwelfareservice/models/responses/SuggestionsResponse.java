package com.louisngatale.studentwelfareservice.models.responses;

public class SuggestionsResponse {
    private String title;
    private String message;
    private String response;

    public SuggestionsResponse() {
    }

    public SuggestionsResponse(String title, String message, String response) {
        this.title = title;
        this.message = message;
        this.response = response;
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

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
