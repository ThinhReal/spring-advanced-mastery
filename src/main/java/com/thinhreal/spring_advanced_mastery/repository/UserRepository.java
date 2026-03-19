package com.thinhreal.spring_advanced_mastery.repository;

import com.thinhreal.spring_advanced_mastery.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // Basic CRUD methods like findById() are already built-in!
}