package com.studygroup.demo;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "study_user")
public class StudyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public StudyUser() {}

    public StudyUser(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
