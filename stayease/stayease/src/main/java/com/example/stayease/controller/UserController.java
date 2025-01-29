package com.example.stayease.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.stayease.entity.User;
import com.example.stayease.security.JwtUtil;
import com.example.stayease.service.UserServiceImpl;

@RestController
public class UserController {

	@Autowired
	UserServiceImpl userService;
	@Autowired
	JwtUtil jwtUtil;

	public UserController(UserServiceImpl userService, JwtUtil jwtUtil) {
		this.userService = userService;
		this.jwtUtil = jwtUtil;
	}

	@PostMapping("/auth/register")
	public ResponseEntity<?> register(@RequestBody User user) {
		userService.registerUser(user);
		return ResponseEntity.ok("User registered successfully!");
	}

	@PostMapping("/auth/login")
	public ResponseEntity<?> login(@RequestBody User user) {
		String token = jwtUtil.generateToken(user.getEmail());
		return ResponseEntity.ok(token);
	}
}
