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

import com.javatpoint.server.main.model.Child1;
import com.javatpoint.server.main.model.Parent1;
import com.javatpoint.server.main.repository.Child1Repository;
import com.javatpoint.server.main.repository.Parent1Repository;


@RestController
public class Child1Controller {
	
	@Autowired
	Child1Repository child1Repository;
	
	@Autowired
	Parent1Repository par1rep;
	
	@GetMapping("/child1/all")
	public List<Child1> getAll()
	{
		return child1Repository.findAll();
	}
	
	@GetMapping("/child1/{id}")
	public Child1 getById(@PathVariable int id)
	{
		return child1Repository.findById(id).get();
	}
	@GetMapping("/parent1/{id}")
	public Parent1 getByIdParent1(@PathVariable int id)
	{
		return par1rep.findById(id).get();
	}
	@GetMapping("/parent1/all")
	public List<Parent1> getAllParent()
	{
		return par1rep.findAll();
	}
	@PostMapping("/child1/create")
	public Child1  createChild1(@RequestBody Child1 child1)
	{
		return child1Repository.save(child1);
		
	}
	
	@PutMapping("/child1/update/{id}")
	public ResponseEntity<?>updateChild1(@RequestBody Child1 child,@PathVariable int id)
	{
		Optional<Child1>chi=child1Repository.findById(id);
		chi.get().setC_name(child.getC_name());
		chi.get().setParent1(child.getParent1());
		Child1 c=child1Repository.save(chi.get());
		return ResponseEntity.ok().body("Updated Successfully");
	}
	
	@DeleteMapping("/child1/delete/{id}")
	public ResponseEntity<?>deleteChild1(@PathVariable int id )
	{
		Optional<Child1> ch=child1Repository.findById(id);
		child1Repository.delete(ch.get());
		return ResponseEntity.ok().body("deleted Successfully");
	}
	

}
