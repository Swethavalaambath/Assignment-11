package com.example.demo1.repository;
import org.springframework.stereotype.Repository;


@Repository
public class UserRepository {

	public void getUsers() {
		System.out.println("From repository");
	}

}



