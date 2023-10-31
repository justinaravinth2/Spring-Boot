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

import com.javatpoint.server.main.model.Party;
import com.javatpoint.server.main.repository.PartyCurrencyRepository;
import com.javatpoint.server.main.repository.PartyEvaluationRepository;
import com.javatpoint.server.main.repository.PartyRepository;
import com.javatpoint.server.main.repository.PartyStateRepository;

@RestController
public class PartyController {
	
	@Autowired
	PartyRepository partyRepository;
	
	@Autowired
	PartyStateRepository partyStateRepository;
	
	@Autowired
	PartyCurrencyRepository partyCurrencyRepository;
	
	@Autowired
	PartyEvaluationRepository partyEvaluationRepository;
	
	@GetMapping("/party/all")
	public List<Party>getAll(){
		
		return partyRepository.findAll();
	}
	
	@GetMapping("/party/{id}")
	public Party getById(@PathVariable int id) 
	{
		
		return partyRepository.findById(id).get();
	}
	
	@PostMapping("/party/create")
	public Party createParty(@RequestBody Party par)
	{
				
		return partyRepository.save(par);
	}
	
	@PutMapping("/party/update/{id}")
	public ResponseEntity<?>updateParty(@RequestBody Party pa,@PathVariable int id){
		
		Party part=partyRepository.findById(id).get();
		part.setParty_name(pa.getParty_name());
		part.setParty_code(pa.getParty_code());
		part.setGstin(pa.getGstin());
		part.setPartystate(pa.getPartystate());
		part.setPartycurrency(pa.getPartycurrency());
		part.setPartyevaluation(pa.getPartyevaluation());
		partyRepository.save(part);
		return ResponseEntity.ok().body("Updated Successfully");
	}
	
	@DeleteMapping("/party/delete/all")
	public ResponseEntity<?> deleteAllParty() {
		partyRepository.deleteAll();
		partyStateRepository.deleteAll();
		partyCurrencyRepository.deleteAll();
		partyEvaluationRepository.deleteAll();
		
		return ResponseEntity.ok().body("All partys are deleted successfully");
	}
}