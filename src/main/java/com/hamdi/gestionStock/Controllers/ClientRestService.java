package com.hamdi.gestionStock.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hamdi.gestionStock.entities.Client;
import com.hamdi.gestionStock.repository.ClientRepository;

@RestController
@RequestMapping("/Client")
public class ClientRestService {
	
	
	@Autowired
	private ClientRepository ClientRepo;
	
	
	@RequestMapping(value = "/",method= RequestMethod.GET)
	public List<Client> findall(){
		return ClientRepo.findAll();
	}
	
	@RequestMapping(value = "/Client/{id}",method= RequestMethod.GET)
	public Client findById(@PathVariable long id) {
		return ClientRepo.findOne(id);
	}
	
	@RequestMapping(value = "/addClient",method= RequestMethod.POST)
	public Client add(@RequestBody Client c) {
		return ClientRepo.save(c);
	}
	
	@RequestMapping(value = "/delClient/{id}",method= RequestMethod.DELETE)
	public Boolean DelById(@PathVariable long id) {
		ClientRepo.delete(id);
		return true;
	}
	
	@RequestMapping(value = "/updateClient/{id}",method= RequestMethod.PUT)
	public Client update (@PathVariable long id ,@RequestBody Client c) {
		c.setIdClient(id);
		return ClientRepo.save(c);
				
	}
	


}
