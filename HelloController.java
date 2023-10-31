package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Hello;
import com.javatpoint.server.main.repository.HelloRepository;

@RestController
public class HelloController {
	
	@Autowired
	HelloRepository hello;
	
	
	@PostMapping("/hello/create")
	public Hello createHello(@RequestBody Hello helo)
	{
		return hello.save(helo);
	}
	
	@GetMapping("/hello")
	public List<Hello> getAll() {
		return hello.findAll();
	}
}
