package com.hamdi.gestionStock.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hamdi.gestionStock.entities.Categorie;
import com.hamdi.gestionStock.repository.CategorieRepository;

@RestController
@RequestMapping("/categorie")
public class CategorieRestService {
	
	
	@Autowired
	private CategorieRepository CategorieRepo;
	
	
	@RequestMapping(value = "/",method= RequestMethod.GET)
	public List<Categorie> findall(){
		return CategorieRepo.findAll();
	}
	
	@RequestMapping(value = "/Categorie/{id}",method= RequestMethod.GET)
	public Categorie findById(@PathVariable long id) {
		return CategorieRepo.findOne(id);
	}
	
	@RequestMapping(value = "/addCategorie",method= RequestMethod.POST)
	public Categorie add(@RequestBody Categorie c) {
		return CategorieRepo.save(c);
	}
	
	@RequestMapping(value = "/delCategorie/{id}",method= RequestMethod.DELETE)
	public Boolean DelById(@PathVariable long id) {
		CategorieRepo.delete(id);
		return true;
	}
	
	@RequestMapping(value = "/updateCategorie/{id}",method= RequestMethod.PUT)
	public Categorie update (@PathVariable long id ,@RequestBody Categorie c) {
		c.setIdCategorie(id);
		return CategorieRepo.save(c);
				
	}
	

}
