package com.louisngatale.studentwelfareservice.models.responses;

import java.sql.Date;
import java.text.DateFormat;

public class SuggestionsResponse {
    private String title;
    private String message;
    private String status;
    private java.util.Date createdAt;

    public SuggestionsResponse() {
    }

    public SuggestionsResponse(String title, String message, String status, java.util.Date createdAt) {
        this.title = title;
        this.message = message;
        this.status = status;
        this.createdAt = createdAt;
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


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
