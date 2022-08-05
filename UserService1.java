package com.example.demo1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.service.UserService;
public class UserService {



@RestController
public class UserController {

	UserService userService;

	
	@Autowired
	public void setService(UserService userService) {
		System.out.println("Service obj injecting===>>");
		this.userService = userService;
	}

	@GetMapping("/test")
	public String getUsers() {
		System.out.println("From controller");
		userService.getUsers();
		return "Success";
	}
}

}
