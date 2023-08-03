package com.studygroup.demo;

import org.springframework.stereotype.Repository;

@Repository
public class StudyUserRepository {

    private final JpaStudyUserRepository repo;

    public StudyUserRepository(JpaStudyUserRepository repo) {
        this.repo = repo;
    }

}
