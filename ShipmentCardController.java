package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.ShipmentCard;
import com.javatpoint.server.main.repository.ShipmentCardRepository;

@RestController
public class ShipmentCardController {
	
	@Autowired
	ShipmentCardRepository shipcard;
	
	@GetMapping("shipcard/all")
	public List<ShipmentCard> getAll(){
		return shipcard.findAll();
	}
	
	@GetMapping("/shipcard/{id}")
	public ShipmentCard getByid(@PathVariable int id)
	{
		return shipcard.getById(id);
	}
	

}
