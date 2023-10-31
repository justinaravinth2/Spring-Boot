package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Problem;
import com.javatpoint.server.main.repository.ProblemRepository;

@RestController
public class ProblemController {
	
	@Autowired
	ProblemRepository prob;
	
	@GetMapping("/prob/all")
	public List<Problem>getAll(){
		return prob.findAll();
	}
	
	@PostMapping("/prob/create")
	public Problem createProlem(@RequestBody Problem pro) {
		
		return prob.save(pro);
	}

}
