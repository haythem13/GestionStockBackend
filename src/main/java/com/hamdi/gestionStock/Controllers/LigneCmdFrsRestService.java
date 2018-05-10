package com.hamdi.gestionStock.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hamdi.gestionStock.entities.LigneCommandeFournisseur;
import com.hamdi.gestionStock.repository.LigneCommandeFournisseurRepository;

@RestController
@RequestMapping("/LigneCommandeFournisseur")
public class LigneCmdFrsRestService {

	@Autowired
	private LigneCommandeFournisseurRepository LigneCommandeFournisseurRepo;
	
	
	@RequestMapping(value = "/",method= RequestMethod.GET)
	public List<LigneCommandeFournisseur> findall(){
		return LigneCommandeFournisseurRepo.findAll();
	}
	
	@RequestMapping(value = "/LigneCommandeFournisseur/{id}",method= RequestMethod.GET)
	public LigneCommandeFournisseur findById(@PathVariable long id) {
		return LigneCommandeFournisseurRepo.findOne(id);
	}
	
	@RequestMapping(value = "/addLigneCommandeFournisseur",method= RequestMethod.POST)
	public LigneCommandeFournisseur add(@RequestBody LigneCommandeFournisseur c) {
		return LigneCommandeFournisseurRepo.save(c);
	}
	
	@RequestMapping(value = "/delLigneCommandeFournisseur/{id}",method= RequestMethod.DELETE)
	public Boolean DelById(@PathVariable long id) {
		LigneCommandeFournisseurRepo.delete(id);
		return true;
	}
	
	@RequestMapping(value = "/updateLigneCommandeFournisseur/{id}",method= RequestMethod.PUT)
	public LigneCommandeFournisseur update (@PathVariable long id ,@RequestBody LigneCommandeFournisseur c) {
		c.setIdLigneCdeFrs(id);
		return LigneCommandeFournisseurRepo.save(c);
				
	}
	

}
