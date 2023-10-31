package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.PartyEvaluation;
import com.javatpoint.server.main.repository.PartyEvaluationRepository;

@RestController
public class PartyEvaluationController {
	
	@Autowired
	PartyEvaluationRepository partyEvaluationRepository;
	
	@GetMapping("/evaluation/all")
	public List<PartyEvaluation>getAll(){
		return partyEvaluationRepository.findAll();
	}

}