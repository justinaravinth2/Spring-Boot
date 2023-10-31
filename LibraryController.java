package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Library;
import com.javatpoint.server.main.repository.BooksRepository;
import com.javatpoint.server.main.repository.LibraryRepository;

@RestController
public class LibraryController {
	
	@Autowired
	LibraryRepository libraryRepository;
	
	@GetMapping("/library")
	public List<Library>getAll()
	{
		return libraryRepository.findAll();
	}
	
	

}
