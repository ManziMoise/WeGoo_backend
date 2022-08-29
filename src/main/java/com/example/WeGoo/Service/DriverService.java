package com.example.WeGoo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WeGoo.Domain.Driver;
import com.example.WeGoo.Repository.DriverRepository;

@Service
public class DriverService {
	

	@Autowired
	private DriverRepository driverRepository;
	
	public Driver saveDriver(Driver driver) {
	try {
		driver.setStatus("Active");
		driver.setRole("Admin");

		return driverRepository.save(driver);
		
	} catch (Exception e) {
		e.printStackTrace();
		throw e;
		
	}
	}
	
	public List<Driver> findAll() {
		
		return driverRepository.findAll();
	}
	
	public  Optional<Driver> getOneById(int id) {
		
		return driverRepository.findById(id);
	}
	
//	public Optional<Admin> getOneByEmail(String email){
//		return adminRepository.findAll(getOneByEmail(email));
//	}
//	

	
	
public String deleteDriver(int id) {
		
	driverRepository.deleteById(id);
		
			
			return "The Driver with  "+id+" Has been deleted";
	}
	


}
