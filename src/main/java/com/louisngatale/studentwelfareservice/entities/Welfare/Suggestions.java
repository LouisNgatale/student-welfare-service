package com.louisngatale.studentwelfareservice.entities.Welfare;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Suggestions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer placedBy;

    private String status;

    private String title;

    private String body;

    private String createdAt;

}
