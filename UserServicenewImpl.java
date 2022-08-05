package com.example.demo2.service;

import org.springframework.stereotype.Service;

@Service("userServiceNewImpl")
public class UserServicenewImpl implements UserService {

	@Override
	public void getUsers() {
		System.out.println("From new service impl ====>>");
	}

}



