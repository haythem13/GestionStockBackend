package com.hamdi.gestionStock.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommandeFournisseur implements Serializable{
	@Id
	@GeneratedValue
	private long idLigneCdeFrs;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	@ManyToOne
	@JoinColumn(name="idCdeFournisseur")
	private CommandeFournisseur commandeFournisseur;
	
	
	
	
	public LigneCommandeFournisseur(Article article, CommandeFournisseur commandeFournisseur) {
		super();
		this.article = article;
		this.commandeFournisseur = commandeFournisseur;
	}
	public LigneCommandeFournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdLigneCdeFrs() {
		return idLigneCdeFrs;
	}
	public void setIdLigneCdeFrs(long idLigneCdeFrs) {
		this.idLigneCdeFrs = idLigneCdeFrs;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public CommandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}
	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}
	
	
}
