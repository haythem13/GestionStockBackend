package com.hamdi.gestionStock.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue
	private long idUtilisateur;
	
	private String nom ;
	private String prenom ;
	private String email ;
	private String motDePass ;
	private String photo ;
	
	
	
	
	
	public Utilisateur( String nom, String prenom, String email, String motDePass, String photo) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motDePass = motDePass;
		this.photo = photo;
	}
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMotDePass() {
		return motDePass;
	}
	public void setMotDePass(String motDePass) {
		this.motDePass = motDePass;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	

}
