package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Idgeneration;
import com.javatpoint.server.main.repository.IdgenerationRepository;

@RestController
public class IdgenerationController {
	
	@Autowired
	IdgenerationRepository idrepo;
	
	@GetMapping("/seq/all")
	public List<Idgeneration>getAll(){
		return idrepo.findAll();
		
	}
	@PostMapping("/seq/create")
	public Idgeneration create(@RequestBody Idgeneration idg) {
		
		idg.setSequence_id(idrepo.seq_generator());
		return idrepo.save(idg);
		
		 
	}

}
