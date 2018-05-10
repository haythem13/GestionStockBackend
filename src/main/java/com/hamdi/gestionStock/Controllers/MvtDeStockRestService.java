package com.hamdi.gestionStock.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hamdi.gestionStock.entities.MvtDeStock;
import com.hamdi.gestionStock.repository.MvtDeStockRepository;


@RestController
@RequestMapping("/MvtDeStock")
public class MvtDeStockRestService {
	
	@Autowired
	private MvtDeStockRepository MvtDeStockRepo;
	
	
	@RequestMapping(value = "/",method= RequestMethod.GET)
	public List<MvtDeStock> findall(){
		return MvtDeStockRepo.findAll();
	}
	
	@RequestMapping(value = "/MvtDeStock/{id}",method= RequestMethod.GET)
	public MvtDeStock findById(@PathVariable long id) {
		return MvtDeStockRepo.findOne(id);
	}
	
	@RequestMapping(value = "/addMvtDeStock",method= RequestMethod.POST)
	public MvtDeStock add(@RequestBody MvtDeStock c) {
		return MvtDeStockRepo.save(c);
	}
	
	@RequestMapping(value = "/delMvtDeStock/{id}",method= RequestMethod.DELETE)
	public Boolean DelById(@PathVariable long id) {
		MvtDeStockRepo.delete(id);
		return true;
	}
	
	@RequestMapping(value = "/updateMvtDeStock/{id}",method= RequestMethod.PUT)
	public MvtDeStock update (@PathVariable long id ,@RequestBody MvtDeStock c) {
		c.setIdMvtStk(id);
		return MvtDeStockRepo.save(c);
				
	}
	


}
