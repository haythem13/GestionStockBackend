package com.hamdi.gestionStock.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hamdi.gestionStock.entities.Vente;
import com.hamdi.gestionStock.repository.VenteRepository;

@RestController
@RequestMapping("/Vente")
public class VenteRestService {
	

	@Autowired
	private VenteRepository VenteRepo;
	
	
	@RequestMapping(value = "/",method= RequestMethod.GET)
	public List<Vente> findall(){
		return VenteRepo.findAll();
	}
	
	@RequestMapping(value = "/Vente/{id}",method= RequestMethod.GET)
	public Vente findById(@PathVariable long id) {
		return VenteRepo.findOne(id);
	}
	
	@RequestMapping(value = "/addVente",method= RequestMethod.POST)
	public Vente add(@RequestBody Vente c) {
		return VenteRepo.save(c);
	}
	
	@RequestMapping(value = "/delVente/{id}",method= RequestMethod.DELETE)
	public Boolean DelById(@PathVariable long id) {
		VenteRepo.delete(id);
		return true;
	}
	
	@RequestMapping(value = "/updateVente/{id}",method= RequestMethod.PUT)
	public Vente update (@PathVariable long id ,@RequestBody Vente c) {
		c.setIdVente(id);
		return VenteRepo.save(c);
				
	}
	


}
