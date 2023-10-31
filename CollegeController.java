package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.College;
import com.javatpoint.server.main.repository.CollegeRepository;

@RestController
public class CollegeController {
	
	@Autowired
	CollegeRepository college;
	
	@GetMapping("/college/all/view")
	public List<College>getAll(){
		return college.findAll();
	}

}
