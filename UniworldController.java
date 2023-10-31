package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Uniworld;
import com.javatpoint.server.main.repository.UniworldRepository;

@RestController
public class UniworldController {
	
	@Autowired
	UniworldRepository unirepo;
	
	@GetMapping("/uniticket/all")
	public List<Uniworld>getAll(){
		return unirepo.findAll();
	}
	
	@PostMapping("/uniticket/create")
	public Uniworld create(@RequestBody Uniworld uni) {
		
		return unirepo.save(uni);
	}
}
