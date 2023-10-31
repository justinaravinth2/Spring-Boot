package com.javatpoint.server.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.User1;
import com.javatpoint.server.main.repository.User1Repository;


@RestController
public class LoginController {
	
	@Autowired
	private User1Repository user1Repo;
	
	@PostMapping("/signup")
	public ResponseEntity<?>signup(@RequestBody User1 use){
		
		User1 user1=new User1();
		user1.setUname(use.getUname());
		user1.setEmail(use.getEmail());
		user1.setPassword(use.getPassword());
		
		//store entity
		
		user1Repo.save(user1);
		
		
		
		return ResponseEntity.ok().body(user1);
	}
	
	@PostMapping("/login")
	public ResponseEntity<?>login(@RequestBody User1 use1)
	{
		
		
		//checking for this customer is already existing or not
		User1 user1=user1Repo.findOneByUnameIgnoreCaseOrEmailIgnoreCaseAndPassword(use1.getUname(),use1.getEmail(),use1.getPassword());
		
		String s;
		if(user1==null) {
		
			s=("You are not Existing customer, Kindly Register and Log in");
		}
		else {
			
			s=("Logged In successfully");
		}
		return ResponseEntity.ok().body(s);
		
		

	}
}
