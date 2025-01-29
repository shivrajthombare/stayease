package com.example.stayease.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stayease.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
