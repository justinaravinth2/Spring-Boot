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

import com.javatpoint.server.main.model.Cycle;
import com.javatpoint.server.main.repository.CycleRepository;

@RestController
public class CycleController {
	
	@Autowired
	CycleRepository cyclerepo;
	
	@GetMapping("/cycle/all")
	public List<Cycle>getAll(){
		return cyclerepo.findAll();
	}
	
	@GetMapping("/cycle/{id}")
	public Cycle getCycleById(@PathVariable int id) {
		
		return cyclerepo.findById(id).get();
	}
	
	@PostMapping("/cycle/new")
	public Cycle createNewCycle(@RequestBody Cycle cycle) {
		
		return cyclerepo.save(cycle);
	}
	
	@PutMapping("/cycle/update/{id}")
	public ResponseEntity<?>updateCycle(@PathVariable int id,@RequestBody Cycle cycle){
		
		Cycle cy=cyclerepo.findById(id).get();
		cy.setCycle_name(cycle.getCycle_name());
		Cycle cl=cyclerepo.save(cy);
		return ResponseEntity.ok().body("successfully updated");
	}
	
	@DeleteMapping("cycle/delete/{id}")
	public ResponseEntity<?>deleteCycle(@PathVariable int id){
		
		Optional<Cycle>cl=cyclerepo.findById(id);
		cyclerepo.delete(cl.get());
		return ResponseEntity.ok().body("Successfully Deleted");
	}
	
	@DeleteMapping("/cycle/delete/all")
	public ResponseEntity<?>deleteAllCycle(@RequestBody Cycle cycle){
		
		cyclerepo.deleteAll();
		return ResponseEntity.ok().body("Succefully All Cycle Deleted");
	}

}
