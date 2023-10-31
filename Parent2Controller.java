package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Parent2;
import com.javatpoint.server.main.repository.Parent2Repsoitory;

@RestController
public class Parent2Controller {
	
	@Autowired
	Parent2Repsoitory p2Repo;
	
	@GetMapping("/parent2/view/all")
	public List<Parent2>getAll(){
		
		return p2Repo.findAll();
	}
	
	@PostMapping("/parent2/create")
	public Parent2 createParent2(@RequestBody Parent2 p2) {
		return p2Repo.save(p2);
	}

}
