package com.example.demo2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.repository.UserRepository;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

	//Autowired by type
	@Autowired
	UserRepository userRepository;

	@Override
	public void getUsers() {
		System.out.println("From service impl ====>>");
	}

}



