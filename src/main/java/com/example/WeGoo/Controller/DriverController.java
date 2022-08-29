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


import com.example.WeGoo.Domain.Driver;
import com.example.WeGoo.Service.DriverService;


@RestController
@RequestMapping("/Driver")
public class DriverController {
	
	@Autowired
	private DriverService driverService;
	
	@PostMapping(value = "/createDriver",consumes = "application/json",produces = "application/json")
	public ResponseEntity<?> saveDriver(@Valid @RequestBody Driver driver){
		
		return new ResponseEntity<Driver>(driverService.saveDriver(driver),HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/allDriver", produces = "application/json")
	public List<Driver>getAlldriver(){
		
		return driverService.findAll();
		
	}

	@GetMapping(value = "/getOneDriver/{id}")
	public Optional<Driver> getOneDriver(@PathVariable("id") int id){
		
		return driverService.getOneById(id);
	}
	
	@PostMapping(value = "/updateDriver",consumes = "application/json",produces = "application/json")
	public ResponseEntity<?> updateDriver(@Valid @RequestBody Driver driver){
		
		return new ResponseEntity<Driver>(driverService.saveDriver(driver),HttpStatus.OK);
		
		
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public String  deleteDriver(@PathVariable("id") int id){
		return driverService.deleteDriver(id);
	}


}
