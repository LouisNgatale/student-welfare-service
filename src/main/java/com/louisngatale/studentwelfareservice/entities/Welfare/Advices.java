package com.louisngatale.studentwelfareservice.entities.Welfare;

import javax.persistence.*;

@Entity
@Table(name = "advices")
public class Advices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer studentId;

    private String message;

}