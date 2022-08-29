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

import com.example.WeGoo.Domain.Booking;
import com.example.WeGoo.Service.BookingService;

@RestController
@RequestMapping("/Booking")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@PostMapping(value = "/createBooking",consumes = "application/json",produces = "application/json")
	public ResponseEntity<?> saveBooking(@Valid @RequestBody Booking booking){
		
		return new ResponseEntity<Booking>(bookingService.saveBooking(booking),HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/allBookings", produces = "application/json")
	public List<Booking>getAllAdmin(){
		
		return bookingService.findAll();
		
	}

	@GetMapping(value = "/getOneBooking/{id}")
	public Optional<Booking> getOneAdmin(@PathVariable("id") int id){
		
		return bookingService.getOneById(id);
	}
	
	@PostMapping(value = "/updateBooking",consumes = "application/json",produces = "application/json")
	public ResponseEntity<?> updateBooking(@Valid @RequestBody Booking booking){
		
		return new ResponseEntity<Booking>(bookingService.saveBooking(booking),HttpStatus.OK);
		
		
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public String  deleteBooking(@PathVariable("id") int id){
		return bookingService.deleteBooking(id);
	}


}
