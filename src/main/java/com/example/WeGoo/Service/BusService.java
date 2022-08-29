package com.example.WeGoo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WeGoo.Domain.Bus;
import com.example.WeGoo.Repository.BusRepository;

@Service
public class BusService {

	@Autowired
	private BusRepository busRepository;
	
	public Bus saveBus(Bus bus) {
	try {
//		booking.setStatus("Active");
//		booking.setRole("Admin");

		return busRepository.save(bus);
		
	} catch (Exception e) {
		e.printStackTrace();
		throw e;
		
	}
	}
	
	public List<Bus> findAll() {
		
		return busRepository.findAll();
	}
	
	public  Optional<Bus> getOneById(int id) {
		
		return busRepository.findById(id);
	}
	
//	public Optional<Admin> getOneByEmail(String email){
//		return adminRepository.findAll(getOneByEmail(email));
//	}
//	

	
	
public String deleteBus(int id) {
		
	busRepository.deleteById(id);
		
			
			return "The bus with  "+id+" Has been deleted";
	}
	


}
