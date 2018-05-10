package com.hamdi.gestionStock.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hamdi.gestionStock.entities.LigneCommandeClient;
import com.hamdi.gestionStock.repository.LigneCommandeClientRepository;

@RestController
@RequestMapping("/LigneCommandeClient")
public class LigneCommandeClientRestService {
	
	@Autowired
	private LigneCommandeClientRepository LigneCommandeClientRepo;
	
	
	@RequestMapping(value = "/",method= RequestMethod.GET)
	public List<LigneCommandeClient> findall(){
		return LigneCommandeClientRepo.findAll();
	}
	
	@RequestMapping(value = "/LigneCommandeClient/{id}",method= RequestMethod.GET)
	public LigneCommandeClient findById(@PathVariable long id) {
		return LigneCommandeClientRepo.findOne(id);
	}
	
	@RequestMapping(value = "/addLigneCommandeClient",method= RequestMethod.POST)
	public LigneCommandeClient add(@RequestBody LigneCommandeClient c) {
		return LigneCommandeClientRepo.save(c);
	}
	
	@RequestMapping(value = "/delLigneCommandeClient/{id}",method= RequestMethod.DELETE)
	public Boolean DelById(@PathVariable long id) {
		LigneCommandeClientRepo.delete(id);
		return true;
	}
	
	@RequestMapping(value = "/updateLigneCommandeClient/{id}",method= RequestMethod.PUT)
	public LigneCommandeClient update (@PathVariable long id ,@RequestBody LigneCommandeClient c) {
		c.setIdLigneCdeClt(id);
		return LigneCommandeClientRepo.save(c);
				
	}

}
