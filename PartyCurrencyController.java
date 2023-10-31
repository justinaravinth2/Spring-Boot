package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.PartyCurrency;
import com.javatpoint.server.main.repository.PartyCurrencyRepository;

@RestController
public class PartyCurrencyController {
	
	@Autowired
	PartyCurrencyRepository partyCurrencyRepository;
	
	@GetMapping("/party/currency/all")
	public List<PartyCurrency>getAll(){
		return partyCurrencyRepository.findAll();
	}

}
