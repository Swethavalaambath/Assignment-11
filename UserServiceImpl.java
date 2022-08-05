package com.example.demo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{
	
	UserRepository userRepository;
	@Autowired
	
	UserServiceImpl(UserRepository userRepository){
		System.out.println("from service");
		this.userRepository=userRepository;
	}
	public void getUsers()
	{

}}
