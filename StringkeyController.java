package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Stringkey;
import com.javatpoint.server.main.repository.StringkeyRepository;
import com.javatpoint.server.main.repository.TicketRepository;

@RestController
public class StringkeyController {

	@Autowired
	StringkeyRepository strepo;
	
	@Autowired
	TicketRepository tic;
	
	
	@GetMapping("/string/all")
	public List<Stringkey>getAll(){
		return strepo.findAll();
	}
	@GetMapping("/string/get/{s_no}")
	public Stringkey getBasedOnS_no(@PathVariable int s_no) {
		return strepo.findById(s_no).get();
	}
	
	@GetMapping("/string/{s_id}")
	public Stringkey getBasedOnS_id(@PathVariable String s_id) {
		return strepo.getByS_id(s_id);
	}
	
	@PostMapping("/string/create")
	public ResponseEntity<?>create(@RequestBody Stringkey str){
		str.setS_no(strepo.s_no());
		str.setS_id("TUWL_"+tic.ticket_generator());
		Stringkey sk=strepo.save(str);
		return ResponseEntity.ok().body(sk);
	}
}
