package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Rat;
import com.javatpoint.server.main.repository.RatRepository;

@RestController
public class RatController {
	
	@Autowired
	RatRepository ratRepository;
	
	@GetMapping("/rat/view/all")
	public List<Rat>getAll(){
		
		return ratRepository.findAll();
	}
	
	@PostMapping("/rat/create")
	public Rat createRat(@RequestBody Rat rat) {
		
		rat.getR_name();
		rat.getR_mobile();
		
		Rat r=ratRepository.save(rat);
		return r;
	}

}
