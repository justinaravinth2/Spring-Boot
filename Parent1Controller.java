package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Parent1;
import com.javatpoint.server.main.repository.Parent1Repository;

@RestController
public class Parent1Controller {
	
	@Autowired
	Parent1Repository pare1;
	
	@GetMapping("/parent1/child1/get")
	public List<Parent1>getAll()
	{
		return pare1.findAll();
	}
}
