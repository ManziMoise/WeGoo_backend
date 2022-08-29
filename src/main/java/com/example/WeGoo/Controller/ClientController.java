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


import com.example.WeGoo.Domain.Client;
import com.example.WeGoo.Service.ClientService;

@RestController
@RequestMapping("/Client")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@PostMapping(value = "/createClient",consumes = "application/json",produces = "application/json")
	public ResponseEntity<?> saveClient(@Valid @RequestBody Client client){
		
		return new ResponseEntity<Client>(clientService.saveClient(client),HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/allClients", produces = "application/json")
	public List<Client>getAllClient(){
		
		return clientService.findAll();
		
	}

	@GetMapping(value = "/getOneClient/{id}")
	public Optional<Client> getOneClient(@PathVariable("id") int id){
		
		return clientService.getOneById(id);
	}
	
	@PostMapping(value = "/updateClient",consumes = "application/json",produces = "application/json")
	public ResponseEntity<?> updateClient(@Valid @RequestBody Client client){
		
		return new ResponseEntity<Client>(clientService.saveClient(client),HttpStatus.OK);
		
		
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public String  deleteClient(@PathVariable("id") int id){
		return clientService.deleteClient(id);
	}


}
