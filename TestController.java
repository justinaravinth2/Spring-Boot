package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Test;
import com.javatpoint.server.main.repository.TestRepository;

@RestController
public class TestController {
	
	@Autowired
	TestRepository testRepository;
	
	@GetMapping("/test/all")
	public List<Test>getAll(){
		return testRepository.findAll();
		
	}
	
	@PostMapping("test/create")
	public Test createTest(@RequestBody Test ts)
	{
		return testRepository.save(ts);
		
	}
	@GetMapping("/test/view/{p_id}")
	public Test getById(@PathVariable int p_id) {
		return testRepository.findById(p_id).get();
	}

}
