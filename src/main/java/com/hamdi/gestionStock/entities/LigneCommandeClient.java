package com.hamdi.gestionStock.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class LigneCommandeClient implements Serializable{
	@Id
	@GeneratedValue
	private long idLigneCdeClt;
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	@ManyToOne
	@JoinColumn(name="idCommandeClient")
	private CommandeClient commandeClient;
	
	
	
	
	public LigneCommandeClient(Article article, CommandeClient commandeClient) {
		super();
		this.article = article;
		this.commandeClient = commandeClient;
	}
	public LigneCommandeClient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdLigneCdeClt() {
		return idLigneCdeClt;
	}
	public void setIdLigneCdeClt(long idLigneCdeClt) {
		this.idLigneCdeClt = idLigneCdeClt;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public CommandeClient getCommandeClient() {
		return commandeClient;
	}
	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}
	
	
}
