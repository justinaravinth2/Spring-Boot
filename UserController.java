package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Role;
import com.javatpoint.server.main.model.User;
import com.javatpoint.server.main.repository.RoleRepository;
import com.javatpoint.server.main.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	RoleRepository roleRepo;
	
	@GetMapping("/user/all")
	public List<User>getAll()
	{
		return userRepo.findAll();
	}
	@GetMapping("/user/{id}")
	public User getById(@PathVariable int id)
	{
		return userRepo.findById(id).get();
	}
	@PostMapping("/user/create")
	public User createUser(@RequestBody User user )
	{
		return userRepo.save(user);
		
	}
	
	

}
