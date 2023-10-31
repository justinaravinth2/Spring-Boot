package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.ShipmentDetails;
import com.javatpoint.server.main.repository.ShipmentDetailsRepository;

@RestController
public class ShipmentDetailsController {
	
	@Autowired
	ShipmentDetailsRepository shipdetailsrepo;
	
	@GetMapping("shipmentdetails/all")
	public List<ShipmentDetails> getAll()
	{
		return shipdetailsrepo.findAll();

	}
}
