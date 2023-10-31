package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Mobile;
import com.javatpoint.server.main.repository.MobileRepository;

@RestController
public class MobileController {
	
	@Autowired
	MobileRepository mobileRepository;
	
	
	@GetMapping("/mobile/all")
	public List<Mobile>getAll()
	{
		return mobileRepository.findAll();
	}
	
	@PostMapping("/mobile/create")
	public Mobile createMobile(@RequestBody Mobile mob){
		
		return mobileRepository.save(mob);
	}

}
