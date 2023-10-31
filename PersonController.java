package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Contact;
import com.javatpoint.server.main.model.Person;
import com.javatpoint.server.main.repository.ContactRepository;
import com.javatpoint.server.main.repository.PersonRepository;

@RestController
public class PersonController {
	
	@Autowired
	PersonRepository personRepository;
	ContactRepository contactRepository;
	
	
	public PersonController(PersonRepository personRepository, ContactRepository contactRepository) {
		super();
		this.personRepository = personRepository;
		this.contactRepository = contactRepository;
	}
	
	@GetMapping("/persons/get")
	public List<Person>getAll()
	{
		return personRepository.findAll();
	}
	
	@GetMapping("/persons/get/{id}")
	public Person getById(@PathVariable int id)
	{
		return personRepository.findById(id).get();
	}
	
	

}
