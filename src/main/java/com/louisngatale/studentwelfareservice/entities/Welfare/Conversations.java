package com.louisngatale.studentwelfareservice.entities.Welfare;


import javax.persistence.*;
import java.util.List;

@Entity
public class Conversations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer studentId;

    public Conversations() {
    }

    public Conversations(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getId() {
        return id;
    }

    @OneToMany(mappedBy = "conversations")
    private List<Messages> messages;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public List<Messages> getMessages() {
        return messages;
    }

    public void setMessages(List<Messages> messages) {
        this.messages = messages;
    }
}
