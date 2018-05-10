package com.hamdi.gestionStock.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hamdi.gestionStock.entities.LigneVente;
import com.hamdi.gestionStock.repository.LigneVenteRepository;

@RestController
@RequestMapping("/LigneVente")
public class LigneVenteRestService {


	@Autowired
	private LigneVenteRepository LigneVenteRepo;
	
	
	@RequestMapping(value = "/",method= RequestMethod.GET)
	public List<LigneVente> findall(){
		return LigneVenteRepo.findAll();
	}
	
	@RequestMapping(value = "/LigneVente/{id}",method= RequestMethod.GET)
	public LigneVente findById(@PathVariable long id) {
		return LigneVenteRepo.findOne(id);
	}
	
	@RequestMapping(value = "/addLigneVente",method= RequestMethod.POST)
	public LigneVente add(@RequestBody LigneVente c) {
		return LigneVenteRepo.save(c);
	}
	
	@RequestMapping(value = "/delLigneVente/{id}",method= RequestMethod.DELETE)
	public Boolean DelById(@PathVariable long id) {
		LigneVenteRepo.delete(id);
		return true;
	}
	
	@RequestMapping(value = "/updateLigneVente/{id}",method= RequestMethod.PUT)
	public LigneVente update (@PathVariable long id ,@RequestBody LigneVente c) {
		c.setIdLigneVente(id);
		return LigneVenteRepo.save(c);
				
	}
	

}
