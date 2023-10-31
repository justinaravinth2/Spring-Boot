package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Role;
import com.javatpoint.server.main.repository.RoleRepository;

@RestController
public class RoleController {
	
	@Autowired
	RoleRepository roleRepo;
	
	@GetMapping("/role/all")
	public List<Role>getAll()
	{
		return roleRepo.findAll();
	}

}
