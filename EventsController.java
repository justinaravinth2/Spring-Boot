package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Events;
import com.javatpoint.server.main.repository.EventRepository;

@RestController
public class EventsController {
	
	@Autowired
	EventRepository event;
	
	@GetMapping("event/all")
	public List<Events>getAll(){
		return event.findAll();
	}
	

}
