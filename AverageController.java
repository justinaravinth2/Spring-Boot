package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Average;
import com.javatpoint.server.main.repository.AverageRepository;

@RestController
public class AverageController {
	
	@Autowired
	AverageRepository avgrepo;
	
	@GetMapping("/average/view/all")
	public List<Average>getAll(){
		return avgrepo.findAll();
	}

	@PostMapping("/average/create")
	public ResponseEntity<?> create(@RequestBody Average avg) {
		
		avgrepo.save(avg);
		avg.setTotal(avg.getTamil()+avg.getEnglish()+avg.getMaths()+avg.getScience()+avg.getSocial());
		avgrepo.save(avg);
		avg.setAverage(avgrepo.avvg())	;
		avgrepo.save(avg);
		return ResponseEntity.ok().body(avgrepo.findAll());
	}
	@DeleteMapping("/average/delete/all")
	public ResponseEntity<?>deleteAll(@RequestBody Average avg){
		avgrepo.deleteAll();
		return ResponseEntity.ok().body("deleted Successfully");
	}
}
