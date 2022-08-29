package com.example.WeGoo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WeGoo.Domain.BusLocation;
import com.example.WeGoo.Repository.BusLocationRepository;

@Service
public class BusLocationService {
	
	@Autowired
	private BusLocationRepository busLocationRepository;
	
	public BusLocation saveBusLocation(BusLocation busLocation) {
	try {
//		booking.setStatus("Active");
//		booking.setRole("Admin");

		return busLocationRepository.save(busLocation);
		
	} catch (Exception e) {
		e.printStackTrace();
		throw e;
		
	}
	}
	
	public List<BusLocation> findAll() {
		
		return busLocationRepository.findAll();
	}
	
	public  Optional<BusLocation> getOneById(int id) {
		
		return busLocationRepository.findById(id);
	}
	
//	public Optional<Admin> getOneByEmail(String email){
//		return adminRepository.findAll(getOneByEmail(email));
//	}
//	

	
	
public String deleteBusLocation(int id) {
		
	busLocationRepository.deleteById(id);
		
			
			return "The bus Location with  "+id+" Has been deleted";
	}
	


}
