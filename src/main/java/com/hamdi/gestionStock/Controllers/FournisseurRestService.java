package com.hamdi.gestionStock.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hamdi.gestionStock.entities.Fournisseur;
import com.hamdi.gestionStock.repository.FournisseurRepository;

@RestController
@RequestMapping("/Fournisseur")
public class FournisseurRestService {
	

	@Autowired
	private FournisseurRepository FournisseurRepo;
	
	
	@RequestMapping(value = "/",method= RequestMethod.GET)
	public List<Fournisseur> findall(){
		return FournisseurRepo.findAll();
	}
	
	@RequestMapping(value = "/Fournisseur/{id}",method= RequestMethod.GET)
	public Fournisseur findById(@PathVariable long id) {
		return FournisseurRepo.findOne(id);
	}
	
	@RequestMapping(value = "/addFournisseur",method= RequestMethod.POST)
	public Fournisseur add(@RequestBody Fournisseur c) {
		return FournisseurRepo.save(c);
	}
	
	@RequestMapping(value = "/delFournisseur/{id}",method= RequestMethod.DELETE)
	public Boolean DelById(@PathVariable long id) {
		FournisseurRepo.delete(id);
		return true;
	}
	
	@RequestMapping(value = "/updateFournisseur/{id}",method= RequestMethod.PUT)
	public Fournisseur update (@PathVariable long id ,@RequestBody Fournisseur c) {
		c.setIdFournisseur(id);
		return FournisseurRepo.save(c);
				
	}
	


}
