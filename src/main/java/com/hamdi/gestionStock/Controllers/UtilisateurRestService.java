package com.hamdi.gestionStock.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hamdi.gestionStock.entities.Utilisateur;
import com.hamdi.gestionStock.repository.UtilisateurRepository;


@RestController
@RequestMapping("/Utilisateur")
public class UtilisateurRestService {
	
	@Autowired
	private UtilisateurRepository UtilisateurRepo;
	
	
	@RequestMapping(value = "/",method= RequestMethod.GET)
	public List<Utilisateur> findall(){
		return UtilisateurRepo.findAll();
	}
	
	@RequestMapping(value = "/Utilisateur/{id}",method= RequestMethod.GET)
	public Utilisateur findById(@PathVariable long id) {
		return UtilisateurRepo.findOne(id);
	}
	
	@RequestMapping(value = "/addUtilisateur",method= RequestMethod.POST)
	public Utilisateur add(@RequestBody Utilisateur c) {
		return UtilisateurRepo.save(c);
	}
	
	@RequestMapping(value = "/delUtilisateur/{id}",method= RequestMethod.DELETE)
	public Boolean DelById(@PathVariable long id) {
		UtilisateurRepo.delete(id);
		return true;
	}
	
	@RequestMapping(value = "/updateUtilisateur/{id}",method= RequestMethod.PUT)
	public Utilisateur update (@PathVariable long id ,@RequestBody Utilisateur c) {
		c.setIdUtilisateur(id);
		return UtilisateurRepo.save(c);
				
	}
	


}
