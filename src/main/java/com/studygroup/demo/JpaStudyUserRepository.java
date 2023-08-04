package com.studygroup.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaStudyUserRepository extends JpaRepository<StudyUser, Long> {

    Optional<StudyUser> findById(Long id);
}