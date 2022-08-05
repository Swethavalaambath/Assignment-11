package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.demo.Service.UserService;
@Controller
public class UserController {
	UserService userService;
	@Autowired 
	UserController(UserService userService){
		System.out.println("from controller");
		this.userService=userService;
	
		}
		
		public void getusers() {
	}
	

}
