package com.hamdi.gestionStock.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class CommandeClient implements Serializable{
	@Id
	@GeneratedValue
	private long idCommandeClient;
	
	private String code;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	@OneToMany(mappedBy ="commandeClient")
	private List<LigneCommandeClient> ligneCommandeClients;
	
	
	

	public CommandeClient() {
		super();
	}

	public CommandeClient(String code, Date dateCommande, Client client,
			List<LigneCommandeClient> ligneCommandeClients) {
		super();
		this.code = code;
		this.dateCommande = dateCommande;
		this.client = client;
		this.ligneCommandeClients = ligneCommandeClients;
	}

	public long getIdCommandeCleint() {
		return idCommandeClient;
	}

	public void setIdCommandeCleint(long idCommandeCleint) {
		this.idCommandeClient = idCommandeCleint;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<LigneCommandeClient> getLigneCommandeClients() {
		return ligneCommandeClients;
	}

	public void setLigneCommandeClients(List<LigneCommandeClient> ligneCommandeClients) {
		this.ligneCommandeClients = ligneCommandeClients;
	}
	
	
}
