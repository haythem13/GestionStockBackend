package com.hamdi.gestionStock.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Categorie implements Serializable {
	@Id
	@GeneratedValue
	private long idCategorie;
	private String code;
	private String designation;
	
	@OneToMany(mappedBy ="categorie")
	private List<Article> articles;
	
	
	public Categorie(String code, String designation, List<Article> articles) {
		super();
		this.code = code;
		this.designation = designation;
		this.articles = articles;
	}

	public Categorie() {
		super();
	}

	public long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
	

}
