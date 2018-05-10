package com.hamdi.gestionStock.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hamdi.gestionStock.entities.CommandeClient;
import com.hamdi.gestionStock.repository.CommandeClientRepository;


@RestController
@RequestMapping("/CommandeClient")
public class CommandeClientRestService {
	
	
	@Autowired
	private CommandeClientRepository CommandeClientRepo;
	
	
	@RequestMapping(value = "/",method= RequestMethod.GET)
	public List<CommandeClient> findall(){
		return CommandeClientRepo.findAll();
	}
	
	@RequestMapping(value = "/CommandeClient/{id}",method= RequestMethod.GET)
	public CommandeClient findById(@PathVariable long id) {
		return CommandeClientRepo.findOne(id);
	}
	
	@RequestMapping(value = "/addCommandeClient",method= RequestMethod.POST)
	public CommandeClient add(@RequestBody CommandeClient c) {
		return CommandeClientRepo.save(c);
	}
	
	@RequestMapping(value = "/delCommandeClient/{id}",method= RequestMethod.DELETE)
	public Boolean DelById(@PathVariable long id) {
		CommandeClientRepo.delete(id);
		return true;
	}
	
	@RequestMapping(value = "/updateCommandeClient/{id}",method= RequestMethod.PUT)
	public CommandeClient update (@PathVariable long id ,@RequestBody CommandeClient c) {
		c.setIdCommandeCleint(id);
		return CommandeClientRepo.save(c);
				
	}
	


}
