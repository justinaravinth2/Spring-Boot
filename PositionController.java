package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Employeee;
import com.javatpoint.server.main.model.Position;
import com.javatpoint.server.main.repository.EmployeeeRepository;
import com.javatpoint.server.main.repository.PositionRepository;

@RestController
public class PositionController {
	
	@Autowired
	EmployeeeRepository employeeeRepository;
	PositionRepository positionRepository;
	
	public PositionController(EmployeeeRepository employeeeRepository, PositionRepository positionRepository) {
		super();
		this.employeeeRepository = employeeeRepository;
		this.positionRepository = positionRepository;
	}
	
	@PostMapping("/employeee/create")
	public Position createEmployeee(@RequestBody Position em)
	{
		return positionRepository.save(em);
	}
}
