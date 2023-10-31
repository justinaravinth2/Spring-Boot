package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Bike;
import com.javatpoint.server.main.repository.BikeRepository;

@RestController
public class BikeController {
	
	@Autowired
	BikeRepository repo;
	
	@GetMapping("/bike/view/all")
	public List<Bike>getAllBike(){
		
		return repo.findAll();
		
	}
	
	@PostMapping("/bike/create")
	public Bike createBike(@RequestBody Bike bk){
		
		return repo.save(bk);
		
	}

}
