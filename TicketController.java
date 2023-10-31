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

import com.javatpoint.server.main.model.Ticket;
import com.javatpoint.server.main.repository.TicketRepository;

@RestController
public class TicketController {
	
	@Autowired
	TicketRepository ticketRepository;
	
	@GetMapping("/ticket/view/all")
	public List<Ticket>getAll(){
		return ticketRepository.findAll();
	}
	
	@GetMapping("/ticket/view/{id}")
	public Ticket getById(@PathVariable int id) {
		return ticketRepository.findById(id).get();
	}
	
	@PostMapping("/ticket/create")
	public Ticket createTicket(@RequestBody Ticket tic) {	
		return ticketRepository.save(tic);
	}
	
	@PutMapping("/ticket/update/{id}")
	public ResponseEntity<?>updateTicket(@RequestBody Ticket tick,@PathVariable int id ){
		Ticket ticket=ticketRepository.findById(id).get();
		ticket.setIssue(tick.getIssue());
		ticket.setDescription(tick.getDescription());
		ticketRepository.save(ticket);
		return ResponseEntity.ok().body("Updated Successfully");
	}
	
	@DeleteMapping("/ticket/delete/{id}")
	public ResponseEntity<?>deleteTicket(@PathVariable int id){
		Ticket tic=ticketRepository.findById(id).get();
		ticketRepository.delete(tic);
		return ResponseEntity.ok().body("Ticket Deleted Successfully");
	}
}
