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

import com.javatpoint.server.main.model.Events;
import com.javatpoint.server.main.model.Shipment;
import com.javatpoint.server.main.model.ShipmentCard;
import com.javatpoint.server.main.repository.EventRepository;
import com.javatpoint.server.main.repository.ShipmentCardRepository;
import com.javatpoint.server.main.repository.ShipmentDetailsRepository;
import com.javatpoint.server.main.repository.ShipmentRepository;

@RestController
public class ShipmentController {
	
	@Autowired
	ShipmentRepository shipmentRepository;
	@Autowired
	ShipmentCardRepository shipmentcard;
	@Autowired
	ShipmentDetailsRepository shipdetailsRepo;
	@Autowired
	EventRepository eventr;
	
	@GetMapping("/ship/all")
	public List<Shipment>getAll(){
		return shipmentRepository.findAll();
	}
	
	@GetMapping("/shipment/get/{id}")
	public Shipment getById(@PathVariable int id)
	{
		
		return shipmentRepository.findById(id).get();
	}
	
	@PostMapping("/shipment/create")
	public Shipment createShipment(@RequestBody Shipment shi)
	{
		shipmentRepository.save(shi);
		
		ShipmentCard shipcard=new ShipmentCard();
		shipcard.setSc_id(shi.getSo_id());
		shipcard.setDoc_id(shi.getDoc_id());
		shipcard.setDoc_date(shi.getDoc_date());
		shipcard.setShipper(shi.getShipper());
		shipcard.setConsignee(shi.getConsignee());
		shipmentcard.save(shipcard);
		
		Events ev=new Events();
		ev.setDoc_id(shi.getDoc_id());
		ev.setE_id(shi.getSo_id());
		ev.setEvent_name("Shipment Created");
		ev.setStatus("Booked");
		eventr.save(ev);
		
		shipmentRepository.save(shi);
		
	
		// sum the packages and chwt and grwt
	
		int so_id=shi.getSo_id();
		int total_pack=shipdetailsRepo.sumPkgs(so_id);
		float total_chwt=shipdetailsRepo.sumChwt(so_id);
		float total_grwt=shipdetailsRepo.sumGrwt(so_id);
		shi.setTotal_packages(total_pack);
		shi.setTotal_ch_wt(total_chwt);
		shi.setTotal_gr_wt(total_grwt);
				
		shipmentRepository.save(shi);
				
		// calculate the Total volumetric chargable weight		
		shipdetailsRepo.update(so_id);
		
		
		
		return shipmentRepository.save(shi);
		
	}

	@PutMapping("/shipment/update/{id}")
	public ResponseEntity<?>updateShipment(@RequestBody Shipment ship,@PathVariable int id)
	{
		Shipment sh=shipmentRepository.findById(id).get();
		sh.setDoc_date(ship.getDoc_date());
		sh.setConsignee(ship.getConsignee());
		sh.setShipper(ship.getShipper());
		shipmentRepository.save(sh);
		
		
		ShipmentCard shipcard=shipmentcard.findById(id).get();
		shipcard.setDoc_date(sh.getDoc_date());
		shipcard.setShipper(sh.getShipper());
		shipcard.setConsignee(sh.getConsignee());
		shipmentcard.save(shipcard);
		
				
		return ResponseEntity.ok().body("Updated Successfully");
	}
	
	@DeleteMapping("/shipment/delete/all")
	public ResponseEntity<?>deleteAllShipment(){
		shipmentRepository.deleteAll();
		shipdetailsRepo.deleteAll();
		shipmentcard.deleteAll();
		eventr.deleteAll();
		
		return ResponseEntity.ok().body("deleted success");
	}
	
		
}
	
	


