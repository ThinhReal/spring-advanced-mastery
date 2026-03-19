package com.thinhreal.spring_advanced_mastery.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    private Long id;
    private String username;
    private String email;
    private String password; // Sensitive data!
}
