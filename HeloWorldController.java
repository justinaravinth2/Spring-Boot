package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.HelloWorld;
import com.javatpoint.server.main.repository.HelloWorldRepository;

@CrossOrigin("http://localhost:4200")
@RestController
public class HeloWorldController {
	
	@Autowired
	HelloWorldRepository helloworld;
	
	@GetMapping(path="/helloworld/get")
	public HelloWorld helloworld(){
		throw new RuntimeException("Something went wrong");
		//return new HelloWorld("Hello World");
		
	}

}
