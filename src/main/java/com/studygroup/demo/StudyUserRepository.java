package com.studygroup.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

@Repository
public class StudyUserRepository {

    private final JpaStudyUserRepository repo;

    public StudyUserRepository(JpaStudyUserRepository repo) {
        this.repo = repo;
    }

    public StudyUser getUserByUserId(long id){
        return repo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
    }

}
