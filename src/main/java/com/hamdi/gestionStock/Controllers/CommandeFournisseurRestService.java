package com.hamdi.gestionStock.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hamdi.gestionStock.entities.CommandeFournisseur;
import com.hamdi.gestionStock.repository.CommandeFournisseurRepository;

@RestController
@RequestMapping("/CommandeFournisseur")
public class CommandeFournisseurRestService {
	

	@Autowired
	private CommandeFournisseurRepository CommandeFournisseurRepo;
	
	
	@RequestMapping(value = "/",method= RequestMethod.GET)
	public List<CommandeFournisseur> findall(){
		return CommandeFournisseurRepo.findAll();
	}
	
	@RequestMapping(value = "/CommandeFournisseur/{id}",method= RequestMethod.GET)
	public CommandeFournisseur findById(@PathVariable long id) {
		return CommandeFournisseurRepo.findOne(id);
	}
	
	@RequestMapping(value = "/addCommandeFournisseur",method= RequestMethod.POST)
	public CommandeFournisseur add(@RequestBody CommandeFournisseur c) {
		return CommandeFournisseurRepo.save(c);
	}
	
	@RequestMapping(value = "/delCommandeFournisseur/{id}",method= RequestMethod.DELETE)
	public Boolean DelById(@PathVariable long id) {
		CommandeFournisseurRepo.delete(id);
		return true;
	}
	
	@RequestMapping(value = "/updateCommandeFournisseur/{id}",method= RequestMethod.PUT)
	public CommandeFournisseur update (@PathVariable long id ,@RequestBody CommandeFournisseur c) {
		c.setIdCdeFournisseur(id);
		return CommandeFournisseurRepo.save(c);
				
	}
	


}
