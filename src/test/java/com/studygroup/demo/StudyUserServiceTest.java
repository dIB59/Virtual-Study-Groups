package com.studygroup.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StudyUserServiceTest {

    @Mock
    private StudyUserRepository repo;

    @InjectMocks
    private StudyUserService service;

    @BeforeEach
    void setUp() {
        // You can perform any setup required for the test here
    }

    long userId = 1L;
    String username = "John Doe";
    StudyUser user = new StudyUser(username);

    @Test
    void testGetUserByUserId_UserFound() {

        when(repo.getUserByUserId(userId)).thenReturn(user);
        StudyUser result = service.getUserByUserId(userId);
        assertEquals(username, result.getName());
        verify(repo, times(1)).getUserByUserId(userId);
    }
    @Test
    void testGetUserByUserId_UserNotFound() {

        long userId = 2L;
        when(repo.getUserByUserId(userId)).thenThrow(new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
        assertThrows(ResponseStatusException.class, () -> {service.getUserByUserId(userId);});
        verify(repo, times(1)).getUserByUserId(userId);
    }
}
