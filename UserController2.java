package com.example.demo2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.service.UserService;

@RestController
public class UserController {

	// Autowired by name
	@Autowired
	UserServiceImpl userServiceNewImpl;

	//autowired by qualifier
	@Autowired
	@Qualifier("userServiceNewImpl")
	UserServiceImpl userService;

	// Autowired by name
	@Autowired
	UserServiceImpl userServiceImpl;

	@GetMapping("/test")
	public String getUsers() {
		userService.getUsers();
		return "Success";
	}

}

