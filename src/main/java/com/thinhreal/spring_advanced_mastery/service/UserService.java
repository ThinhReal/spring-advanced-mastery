package com.thinhreal.spring_advanced_mastery.service;

import com.thinhreal.spring_advanced_mastery.entity.UserEntity;
import com.thinhreal.spring_advanced_mastery.repository.UserRepository;
import com.thinhreal.spring_advanced_mastery.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public UserDTO getUserById(Long id) {
        // 1. Fetch from "DB" (using a dummy user if not found)
        UserEntity entity = userRepository.findById(id)
                .orElse(new UserEntity(1L, "Thinh Real", "thinh@rmit.edu.vn", "secret_pass_123"));
        // 2. Map Entity -> DTO (The most important part!)
        UserDTO dto = new UserDTO();
        dto.setUsername(entity.getUsername());
        dto.setEmail(entity.getEmail());

        return dto;
    }
}