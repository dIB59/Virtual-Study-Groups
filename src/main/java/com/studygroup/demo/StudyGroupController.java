package com.studygroup.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class StudyGroupController {

    private final StudyUserService service;

    public StudyGroupController( StudyUserService service){
        this.service = service;
    }

    @GetMapping
    public String sayHello() {
        return "hello";
    }

    @GetMapping(path = "{id}")
    public StudyUser getUserByUserId(@PathVariable long id){
        return service.getUserByUserId(id);
    }

}