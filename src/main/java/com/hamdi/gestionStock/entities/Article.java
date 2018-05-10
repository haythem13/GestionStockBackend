package com.hamdi.gestionStock.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article implements Serializable {

	@Id
	@GeneratedValue
	 private long idArticle; 
	
	private String codeArticle;
	private String designation;
	private BigDecimal prixUnitaireHT;
	private BigDecimal tauxTVA;
	private BigDecimal prixUnitaireTTC;
	private String photo;
	
	@ManyToOne
	@JoinColumn(name="idCategorie")
	private Categorie categorie;
	
	
	
	public Article(String codeArticle, String designation, BigDecimal prixUnitaireHT, BigDecimal tauxTVA,
			BigDecimal prixUnitaireTTC, String photo, Categorie categorie) {
		super();
		this.codeArticle = codeArticle;
		this.designation = designation;
		this.prixUnitaireHT = prixUnitaireHT;
		this.tauxTVA = tauxTVA;
		this.prixUnitaireTTC = prixUnitaireTTC;
		this.photo = photo;
		this.categorie = categorie;
	}

	public Article() {
		super();
	}

	public long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(long idArticle) {
		this.idArticle = idArticle;
	}

	public String getCodeArticle() {
		return codeArticle;
	}

	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public BigDecimal getPrixUnitaireHT() {
		return prixUnitaireHT;
	}

	public void setPrixUnitaireHT(BigDecimal prixUnitaireHT) {
		this.prixUnitaireHT = prixUnitaireHT;
	}

	public BigDecimal getTauxTVA() {
		return tauxTVA;
	}

	public void setTauxTVA(BigDecimal tauxTVA) {
		this.tauxTVA = tauxTVA;
	}

	public BigDecimal getPrixUnitaireTTC() {
		return prixUnitaireTTC;
	}

	public void setPrixUnitaireTTC(BigDecimal prixUnitaireTTC) {
		this.prixUnitaireTTC = prixUnitaireTTC;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
}
