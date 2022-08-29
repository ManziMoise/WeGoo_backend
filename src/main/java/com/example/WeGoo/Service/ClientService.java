package com.example.WeGoo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WeGoo.Domain.Client;

import com.example.WeGoo.Repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public Client saveClient(Client client) {
	try {
		client.setStatus("Active");
		client.setRole("Admin");

		return clientRepository.save(client);
		
	} catch (Exception e) {
		e.printStackTrace();
		throw e;
		
	}
	}
	
	public List<Client> findAll() {
		
		return clientRepository.findAll();
	}
	
	public  Optional<Client> getOneById(int id) {
		
		return clientRepository.findById(id);
	}
	
//	public Optional<Admin> getOneByEmail(String email){
//		return adminRepository.findAll(getOneByEmail(email));
//	}
//	

	
	
public String deleteClient(int id) {
		
	clientRepository.deleteById(id);
		
			
			return "The Client with  "+id+" Has been deleted";
	}
	



}
