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

import com.javatpoint.server.main.model.Laptop;
import com.javatpoint.server.main.repository.LaptopRepository;



@RestController
public class LaptopController {
	@Autowired
	LaptopRepository repo;
	
	@GetMapping("/laptop/view/all")
	public List<Laptop>getAll(){
		return repo.findAll();
	}
	
	@GetMapping("/laptop/view/{id}")
	public Laptop getById(@PathVariable int id) {
		
		return repo.findById(id).get();
	}
	
	@PostMapping("/laptop/create")
	public Laptop createEmployee(@RequestBody Laptop emp) {
		
		emp.getFirstName();
		emp.getLastName();
		emp.getEmailId();
		emp.getMobile();
		emp.getSalary();
		Laptop em=repo.save(emp);
		return em;
	}
	
	@PutMapping("/laptop/update/{id}")
	public ResponseEntity<?>updateEmployee(@PathVariable int id,@RequestBody Laptop emp){
		
		Laptop et=repo.findById(id).get();
		et.setFirstName(emp.getFirstName());
		et.setLastName(emp.getLastName());
		et.setEmailId(emp.getEmailId());
		et.setMobile(emp.getMobile());
		et.setSalary(emp.getSalary());
		Laptop st=repo.save(et);
		return ResponseEntity.ok().body("Updated success fully");
	}
	
	@DeleteMapping("/laptop/delete/{id}")
	public ResponseEntity<?>deleteEmployee(@PathVariable int id){
		
		Optional<Laptop> emp=repo.findById(id);
		repo.delete(emp.get());
		return ResponseEntity.ok().body("Deleted Success fully");
	}

}
