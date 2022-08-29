package com.example.WeGoo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WeGoo.Domain.Admin;
import com.example.WeGoo.Repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	public Admin saveAdmin(Admin admin) {
	try {
//		admin.setStatus("Active");
//		admin.setRole("Admin");
//		admin.setFirstName("Meme");
//		admin.setLastName("Admin");
//		admin.setPhoneNo("0780000000");
//		admin.setNid("1234567812345678");
//		admin.setGender("Male");
		

		return adminRepository.save(admin);
		
	} catch (Exception e) {
		e.printStackTrace();
		throw e;
		
	}
	}
	
	public List<Admin> findAll() {
		
		return adminRepository.findAll();
	}
	
	public  Optional<Admin> getOneById(int id) {
		
		return adminRepository.findById(id);
	}
	
//	public Optional<Admin> getOneByEmail(String email){
//		return adminRepository.findAll(getOneByEmail(email));
//	}
//	

	
	
public String deleteAdmin(int id) {
		
		adminRepository.deleteById(id);
		
			
			return "The Admin with  "+id+" Has been deleted";
	}
	

}
