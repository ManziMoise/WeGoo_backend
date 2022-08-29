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

import com.example.WeGoo.Domain.Admin;
import com.example.WeGoo.Service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping(value = "/createAdmin",consumes = "application/json",produces = "application/json")
	public ResponseEntity<?> saveAdmin(@Valid @RequestBody Admin admin){
		
		return new ResponseEntity<Admin>(adminService.saveAdmin(admin),HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/allAdmin", produces = "application/json")
	public List<Admin>getAllAdmin(){
		
		return adminService.findAll();
		
	}

	@GetMapping(value = "/getOneAdmin/{id}")
	public Optional<Admin> getOneAdmin(@PathVariable("id") int id){
		
		return adminService.getOneById(id);
	}
	
	@PostMapping(value = "/updateAdmin",consumes = "application/json",produces = "application/json")
	public ResponseEntity<?> updateAdmin(@Valid @RequestBody Admin admin){
		
		return new ResponseEntity<Admin>(adminService.saveAdmin(admin),HttpStatus.OK);
		
		
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public String  deleteAdmin(@PathVariable("id") int id){
		return adminService.deleteAdmin(id);
	}

}
