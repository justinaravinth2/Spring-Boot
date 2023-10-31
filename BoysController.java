package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Boys;
import com.javatpoint.server.main.model.Scores;
import com.javatpoint.server.main.repository.BoysRepository;
import com.javatpoint.server.main.repository.ScoresRepository;

@RestController
public class BoysController {
	
	private BoysRepository boysRepository;
	private ScoresRepository scoresRepository;
	
	public BoysController(BoysRepository boysRepository, ScoresRepository scoresRepository) {
		super();
		this.boysRepository = boysRepository;
		this.scoresRepository = scoresRepository;
	}
	
	@GetMapping("/boys/get")
	public List<Boys>getAll()
	{
		return boysRepository.findAll();
	
	}
	
	@GetMapping("boys/get/{sno}")
	public Boys boysAll(@PathVariable int sno)
	{
		return boysRepository.findById(sno).get();
	}
	
	@GetMapping("scores/get")
	public List<Scores>scoresgetAll()
	{
		return scoresRepository.findAll();
		
	}
	
	@GetMapping("scores/get/{sno}")
	public Scores scoresAll(@PathVariable int sno)
	{
		return scoresRepository.findById(sno).get();
	}
}
