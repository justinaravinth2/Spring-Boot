package com.javatpoint.server.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Employeee;
import com.javatpoint.server.main.model.Position;
import com.javatpoint.server.main.repository.EmployeeeRepository;
import com.javatpoint.server.main.repository.PositionRepository;

@RestController
public class EmployeeeController {
	
	@Autowired
	EmployeeeRepository employeeeRepository;
	PositionRepository positionRepository;
	
	public EmployeeeController(EmployeeeRepository employeeeRepository, PositionRepository positionRepository) {
		super();
		this.employeeeRepository = employeeeRepository;
		this.positionRepository = positionRepository;
	}
	
	@GetMapping("/employeee/get")
	public List<Position>getAll()
	{
		return positionRepository.findAll();
	}
	
	@GetMapping("/employeee/get/{id}")
	public Employeee getByEmployeeeId(@PathVariable int id)
	{
		return employeeeRepository.findById(id).get();
	}
	
//	@PostMapping("/employeee/create")
//	public Employeee createEmployeee(@RequestBody Employeee em)
//	{
//		return employeeeRepository.save(em);
//	}
	
	@PutMapping("/employeee/update")
	public ResponseEntity<?>updateEmployeee(@RequestBody Employeee emp,@PathVariable int id)
	{
		Employeee emplo=employeeeRepository.findById(id).get();
		emplo.setEmpl_email(emp.getEmpl_email());
		emplo.setEmpl_name(emp.getEmpl_name());
		Position posi=positionRepository.findById(id).get();
		posi.setP_name(emp.getPosition().getP_name());
		Position pos=positionRepository.save(posi);
		emplo.setPosition(pos);
		Employeee employ=employeeeRepository.save(emplo);
		return ResponseEntity.ok().body("Updated Successfully");
		
	}
	
	@DeleteMapping("/employeee/delete/{id}")
	public ResponseEntity<?>deleteEmployeee(@PathVariable int id)
	{
		Optional<Employeee>employe=employeeeRepository.findById(id);
		employeeeRepository.delete(employe.get());
		return ResponseEntity.ok().body("deleted Successfully");
	}

	

}
