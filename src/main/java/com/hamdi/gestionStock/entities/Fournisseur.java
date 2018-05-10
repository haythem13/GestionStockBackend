package com.hamdi.gestionStock.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Fournisseur implements Serializable{
	@Id
	@GeneratedValue
	private long idFournisseur;
	
	private String nom;
	private String prenom ;
	private String adress;
	private String email;
	private String photo ;
	
	@OneToMany(mappedBy = "fournisseur")	
	private List<CommandeFournisseur> commandeFournisseur;
	
	
	
	
	public Fournisseur(String nom, String prenom, String adress, String email, String photo,
			List<CommandeFournisseur> commandeFournisseur) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
		this.email = email;
		this.photo = photo;
		this.commandeFournisseur = commandeFournisseur;
	}
	public long getIdFournisseur() {
		return idFournisseur;
	}
	public void setIdFournisseur(long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	} 
	
	public Fournisseur() {
		super();
	}
	
	
	
}
