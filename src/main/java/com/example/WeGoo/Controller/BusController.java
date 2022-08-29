package com.example.WeGoo.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.WeGoo.Domain.Bus;
import com.example.WeGoo.Service.BusService;

@RestController
@RequestMapping("/Bus")
public class BusController {
	
	@Autowired
	private BusService busService;
	
	@PostMapping(value = "/createBus",consumes = "application/json",produces = "application/json")
	public ResponseEntity<?> saveBus(@Valid @RequestBody Bus bus){
		
		return new ResponseEntity<Bus>(busService.saveBus(bus),HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/allBuses", produces = "application/json")
	public List<Bus>getAllBus(){
		
		return busService.findAll();
		
	}

	@GetMapping(value = "/getOneBus/{id}")
	public Optional<Bus> getOneBus(@PathVariable("id") int id){
		
		return busService.getOneById(id);
	}
	
	@PostMapping(value = "/updateBus",consumes = "application/json",produces = "application/json")
	public ResponseEntity<?> updateBus(@Valid @RequestBody Bus bus){
		
		return new ResponseEntity<Bus>(busService.saveBus(bus),HttpStatus.OK);
		
		
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public String  deleteBus(@PathVariable("id") int id){
		return busService.deleteBus(id);
	}




}
