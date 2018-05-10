package com.hamdi.gestionStock.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneVente implements Serializable {
	@Id
	@GeneratedValue
	private long idLigneVente;
	
	@ManyToOne
	@JoinColumn(name="idVente")
	private Vente vente;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
	
	

	public LigneVente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LigneVente(Vente vente, Article article) {
		super();
		this.vente = vente;
		this.article = article;
	}

	public long getIdLigneVente() {
		return idLigneVente;
	}

	public void setIdLigneVente(long idLigneVente) {
		this.idLigneVente = idLigneVente;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	
	

}
