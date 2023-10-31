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

import com.javatpoint.server.main.model.Child;
import com.javatpoint.server.main.model.Parent;
import com.javatpoint.server.main.repository.ChildRepository;
import com.javatpoint.server.main.repository.ParentRepository;

@RestController
public class ParentController {
	
	@Autowired
	ParentRepository repo;
	@Autowired
	ChildRepository childRepository;
	
	@GetMapping("/parent/all")
	public List<Parent> getAll() {
		return repo.findAll();
	}
	
	@GetMapping("/parent/{id}")
	public Parent getById(@PathVariable int id)
	{
		return repo.findById(id).get();
	}
	@GetMapping("/child/all")
	public List<Child> getAllChild() {
		return childRepository.findAll();
	}
	
	@GetMapping("/child/{id}")
	public Child getByIdChild(@PathVariable int id) {
		return childRepository.findById(id).get();
	}
	
	@PostMapping("/parent/create")
	public Parent createParent(@RequestBody Parent paren)
	{
		return repo.save(paren);
	}
	
	@DeleteMapping("/parent/delete/{id}")
	public ResponseEntity<?>deleteParent(@PathVariable int id)
	{
		Optional<Parent> par=repo.findById(id);
		repo.delete(par.get());
		return ResponseEntity.ok().body("deleted successfully");
	}
	
	@PutMapping("parent/update/{id}")
	public ResponseEntity<?> updateParent(@RequestBody Parent par,@PathVariable  int id)
	{
		Optional<Parent> pare=repo.findById(id);
		pare.get().setName(par.getName());
		pare.get().setChild(par.getChild());
		Parent paren=repo.save(pare.get());
		return ResponseEntity.ok().body("Updated Successfully");
	}
	
	@PutMapping("child/update/{id}")
	public ResponseEntity<?>updateChild(@RequestBody Child chi,@PathVariable int id)
	{
		Optional<Child> ch=childRepository.findById(id);
		ch.get().setName(chi.getName());
		Child chil=childRepository.save(ch.get());
		return ResponseEntity.ok().body("Updated Successfully");
	}
	
	@DeleteMapping("child/delete/{id}")
	public ResponseEntity<?>deleteChild(@PathVariable int id)
	{
		Optional<Child>ch=childRepository.findById(id);
		childRepository.delete(ch.get());
		return ResponseEntity.ok().body("Successfully Deleted the child" );
	}
	
	

}
