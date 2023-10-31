package com.javatpoint.server.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Can;
import com.javatpoint.server.main.repository.CanRepository;

@RestController

public class CanController {
	
	@Autowired
	CanRepository canRepository;
	
	@GetMapping("/can/getall")
	public List<Can>getAll()
	{
		return canRepository.findAll();
		
	}
	
	@GetMapping("/can/get/{id}")
	public Can getByCan(@PathVariable int id)
	{
		return canRepository.findById(id).get();
	
		
	}
	
	@PostMapping("/can/create")
	public Can  createCan(@RequestBody Can cn)
	{
		return canRepository.save(cn);
		
	}
	
	@PutMapping("/can/update/{id}")
	public ResponseEntity<?>updateCan(@RequestBody Can cn,@PathVariable int id)
	{
		Can can= canRepository.findById(id).get();
		can.setCan_date(cn.getCan_date());
		can.setCan_type(cn.getCan_type());
		can.setMawb_no(cn.getMawb_no());
		can.setShipment_order_no(cn.getShipment_order_no());
		can.setHouse_no(cn.getHouse_no());
		can.setHouse_date(cn.getHouse_date());
		can.setCommodity(cn.getCommodity());
		can.setActual_qty(cn.getActual_qty());
		can.setArrived_qty(cn.getArrived_qty());
		can.setActual_chwt(cn.getActual_chwt());
		can.setArrived_chwt(cn.getArrived_chwt());
		can.setActual_grwt(cn.getActual_grwt());
		can.setArrived_grwt(cn.getArrived_grwt());
		can.setVolume(cn.getVolume());
		can.setInco_terms(cn.getInco_terms());
		can.setUom(cn.getUom());
		can.setPol(cn.getPol());
		can.setPod(cn.getPod());
		can.setBro(cn.getBro());
		can.setShipper(cn.getShipper());
		can.setShipper_address_type(cn.getShipper_address_type());
		can.setShipper_city(cn.getShipper_city());
		can.setShipper_state(cn.getShipper_state());
		can.setShipper_country(cn.getShipper_country());
		can.setShipper_street(cn.getShipper_street());
		can.setShipper_pin(cn.getShipper_pin());
		can.setConsignee(cn.getConsignee());
		can.setConsignee_address_type(cn.getConsignee_address_type());
		can.setConsignee_city(cn.getConsignee_city());
		can.setConsignee_state(cn.getConsignee_state());
		can.setConsignee_country(cn.getConsignee_country());
		can.setConsignee_street(cn.getConsignee_street());
		can.setConsignee_pin(cn.getConsignee_pin());
		can.setNotify(cn.getNotify());
		can.setNotify_address_type(cn.getNotify_address_type());
		can.setNotify_city(cn.getNotify_city());
		can.setNotify_state(cn.getNotify_state());
		can.setNotify_country(cn.getNotify_country());
		can.setNotify_street(cn.getNotify_street());
		can.setNotify_pin(cn.getNotify_pin());
		can.setBill_to_party_addr_same_flag(cn.getBill_to_party_addr_same_flag());
		can.setCons_notify_addr_flag(cn.getCons_notify_addr_flag());
		can.setBill_to_party(cn.getBill_to_party());
		can.setBill_to_party_address_type(cn.getBill_to_party_address_type());
		can.setBill_to_party_city(cn.getBill_to_party_city());
		can.setBill_to_party_state(cn.getBill_to_party_state());
		can.setBill_to_party_country(cn.getBill_to_party_country());
		can.setBill_to_party_street(cn.getBill_to_party_street());
		can.setBill_to_party_pin(cn.getBill_to_party_pin());
		can.setCan_status(cn.getCan_status());
		can.setDo_status(cn.getDo_status());
		can.setCreated_by(cn.getCreated_by());
		can.setCreated_date(cn.getCreated_date());
		can.setModified_by(cn.getModified_by());
		can.setModified_date(cn.getModified_date());
		Can an=canRepository.save(can);
		return ResponseEntity.ok().body("Updated Successfully");
		
	}
	
	@DeleteMapping("can/delete/{id}")
	public ResponseEntity<?>deleteCan(@PathVariable int id)
	{
		Optional<Can>dlt=canRepository.findById(id);
		canRepository.delete(dlt.get());
		return ResponseEntity.ok().body("Deleted Successfully");
		
	}

}
