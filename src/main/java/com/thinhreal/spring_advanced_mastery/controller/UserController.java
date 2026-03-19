package com.thinhreal.spring_advanced_mastery.controller;

import com.thinhreal.spring_advanced_mastery.dto.UserDTO;
import com.thinhreal.spring_advanced_mastery.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{id}")
    public UserDTO getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}