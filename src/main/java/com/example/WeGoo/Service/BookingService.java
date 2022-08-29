package com.example.WeGoo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.WeGoo.Domain.Booking;
import com.example.WeGoo.Repository.BookingRepository;

@Service
public class BookingService {
	
	@Autowired
	private BookingRepository bookingRepository;
	
	public Booking saveBooking(Booking booking) {
	try {
//		booking.setStatus("Active");
//		booking.setRole("Admin");

		return bookingRepository.save(booking);
		
	} catch (Exception e) {
		e.printStackTrace();
		throw e;
		
	}
	}
	
	public List<Booking> findAll() {
		
		return bookingRepository.findAll();
	}
	
	public  Optional<Booking> getOneById(int id) {
		
		return bookingRepository.findById(id);
	}
	
//	public Optional<Admin> getOneByEmail(String email){
//		return adminRepository.findAll(getOneByEmail(email));
//	}
//	

	
	
public String deleteBooking(int id) {
		
	bookingRepository.deleteById(id);
		
			
			return "The Booking with  "+id+" Has been deleted";
	}
	


}
