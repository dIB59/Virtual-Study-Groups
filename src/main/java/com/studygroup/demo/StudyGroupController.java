package com.studygroup.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudyGroupController {

    @GetMapping
    public String sayHello() {
        return "hello";
    }
}
