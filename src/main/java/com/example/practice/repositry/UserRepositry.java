package com.example.practice.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.entity.User;

public interface UserRepositry extends JpaRepository<User, Long> {
    
}
