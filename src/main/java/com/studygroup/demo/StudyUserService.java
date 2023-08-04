package com.studygroup.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudyUserService {

    private final StudyUserRepository repo;

    @Autowired
    StudyUserService( StudyUserRepository repo){
        this.repo = repo;
    }

    public StudyUser getUserByUserId(long id){
        return repo.getUserByUserId(id);
    }
}
