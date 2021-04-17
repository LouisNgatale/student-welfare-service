package com.louisngatale.studentwelfareservice.entities.Welfare;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Suggestions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer placedBy;

    private String status = "PENDING REVIEW";

    private String title;

    private String body;

    @Column(name = "createdAt",columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private Date createdAt;

    public Suggestions() {
    }

    public Suggestions(Integer placedBy,  String title, String body) {
        this.placedBy = placedBy;
        this.status = status;
        this.title = title;
        this.body = body;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlacedBy() {
        return placedBy;
    }

    public void setPlacedBy(Integer placedBy) {
        this.placedBy = placedBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
