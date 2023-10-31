package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Manager;
import com.javatpoint.server.main.repository.CarsRepository;
import com.javatpoint.server.main.repository.ManagerRepository;

@RestController
public class ManagerController {
	
	@Autowired
	ManagerRepository managerRepository;
	CarsRepository carsRepository;
	
	
	@GetMapping("/manager/view/all")
	public List<Manager>getAll(){
		return managerRepository.findAll();
	}
	
	
	@GetMapping("/manager/view/{id}")
	public Manager getById(@PathVariable int id) {
		
		return managerRepository.findById(id).get();
	}
	
	@PostMapping("/manager/create")
	public Manager createManager(@RequestBody Manager manager) {
		
		return managerRepository.save(manager);
	}
	
	@PutMapping("/manager/update/{id}")
	public ResponseEntity<?>updateManager(@RequestBody Manager manager,@PathVariable int id){
		Manager mng=managerRepository.findById(id).get();
		mng.setM_name(manager.getM_name());
		mng.setM_city(manager.getM_city());
		mng.setCars(manager.getCars());
		Manager mg=managerRepository.save(mng);
		return ResponseEntity.ok().body(mg);
	}
	
	@DeleteMapping("/manager/delete/{id}")
	public ResponseEntity<?>deleteById(@PathVariable int id ){
		
		Manager mg=managerRepository.findById(id).get();
		managerRepository.delete(mg);
		return ResponseEntity.ok().body("manager Deleted");
	}
	
	@DeleteMapping("/manager/delete/all")
	public ResponseEntity<?>deleteAll(){
		
		managerRepository.deleteAll();
		return ResponseEntity.ok().body("all manager Deleted");
	}

}
