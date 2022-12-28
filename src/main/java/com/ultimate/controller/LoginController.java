package com.ultimate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ultimate.model.User;
import com.ultimate.repository.UserRepository;

@RestController
public class LoginController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/register")
	public User Register(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@PostMapping("/login")
	public User Login(@RequestBody User user) {
		User isUser=userRepository.findByEmailAndPassword(user.email, user.password);
		return isUser;
	}
}
