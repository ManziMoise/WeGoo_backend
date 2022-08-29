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

import com.example.WeGoo.Domain.BusLocation;
import com.example.WeGoo.Service.BusLocationService;



@RestController
@RequestMapping("/BusLocation")

public class BusLocationController {
	
	@Autowired
	private BusLocationService busLocationService;
	
	@PostMapping(value = "/createBusLocation",consumes = "application/json",produces = "application/json")
	public ResponseEntity<?> saveBusLocation(@Valid @RequestBody BusLocation busLocation){
		
		return new ResponseEntity<BusLocation>(busLocationService.saveBusLocation(busLocation),HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/allBusLocations", produces = "application/json")
	public List<BusLocation>getAllBusLocation(){
		
		return busLocationService.findAll();
		
	}

	@GetMapping(value = "/getOneBusLocation/{id}")
	public Optional<BusLocation> getOneBusLocation(@PathVariable("id") int id){
		
		return busLocationService.getOneById(id);
	}
	
	@PostMapping(value = "/updateBusLocation",consumes = "application/json",produces = "application/json")
	public ResponseEntity<?> updateBusLocation(@Valid @RequestBody BusLocation busLocation){
		
		return new ResponseEntity<BusLocation>(busLocationService.saveBusLocation(busLocation),HttpStatus.OK);
		
		
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public String  deleteBusLocation(@PathVariable("id") int id){
		return busLocationService.deleteBusLocation(id);
	}


}
