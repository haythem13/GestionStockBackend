package com.hamdi.gestionStock.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.apache.tomcat.jni.Address;
@Entity
public class Client implements Serializable{
	@Id
	@GeneratedValue
	private long idClient;
	
	private String nom;
	private String prenom ;
	private String adress;
	private String email;
	private String photo ; 
	
	@OneToMany(mappedBy ="client")
	private List<CommandeClient> commandesClient;
	
	
	public Client(String nom, String prenom, String adress, String email, String photo,
			List<CommandeClient> commandesClient) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
		this.email = email;
		this.photo = photo;
		this.commandesClient = commandesClient;
	}

	public Client() {
		super();
	}
	
	public long getIdClient() {
		return idClient;
	}
	public void setIdClient(long idClient) {
		this.idClient = idClient;
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
	

	public List<CommandeClient> getCommandesClient() {
		return commandesClient;
	}

	public void setCommandesClient(List<CommandeClient> commandesClient) {
		this.commandesClient = commandesClient;
	}
	
	

}
