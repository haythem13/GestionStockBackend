package com.hamdi.gestionStock.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hamdi.gestionStock.entities.Article;
import com.hamdi.gestionStock.repository.ArticleRepository;

@RestController
@RequestMapping("/article")
@CrossOrigin("*")
public class ArticleRestService {
	
	@Autowired
	private ArticleRepository articleRepo;
	
	
	@RequestMapping(value = "/",method= RequestMethod.GET)
	public List<Article> findall(){
		return articleRepo.findAll();
	}
	
	@RequestMapping(value = "/Article/{id}",method= RequestMethod.GET)
	public Article findById(@PathVariable long id) {
		return articleRepo.findOne(id);
	}
	
	@RequestMapping(value = "/addArticle",method= RequestMethod.POST)
	public Article add(@RequestBody Article c) {
		return articleRepo.save(c);
	}
	
	@RequestMapping(value = "/delArticle/{id}",method= RequestMethod.DELETE)
	public Boolean DelById(@PathVariable long id) {
		articleRepo.delete(id);
		return true;
	}
	
	@RequestMapping(value = "/updateArticle/{id}",method= RequestMethod.PUT)
	public Article update (@PathVariable long id ,@RequestBody Article c) {
		c.setIdArticle(id);
		return articleRepo.save(c);
				
	}
	
	
	
	

}
