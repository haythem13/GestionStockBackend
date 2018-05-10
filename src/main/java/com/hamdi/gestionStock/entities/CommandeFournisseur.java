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
public class CommandeFournisseur implements Serializable{
	@Id
	@GeneratedValue
	private long idCdeFournisseur;
	
	private String code;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	@ManyToOne
	@JoinColumn(name="idFournisseur")
	private Fournisseur fournisseur;
	@OneToMany(mappedBy ="commandeFournisseur")
	private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
	
	
	
	public CommandeFournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CommandeFournisseur(String code, Date dateCommande, Fournisseur fournisseur,
			List<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
		super();
		this.code = code;
		this.dateCommande = dateCommande;
		this.fournisseur = fournisseur;
		this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
	}
	public long getIdCdeFournisseur() {
		return idCdeFournisseur;
	}
	public void setIdCdeFournisseur(long idCdeFournisseur) {
		this.idCdeFournisseur = idCdeFournisseur;
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
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	public List<LigneCommandeFournisseur> getLigneCommandeFournisseurs() {
		return ligneCommandeFournisseurs;
	}
	public void setLigneCommandeFournisseurs(List<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
		this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
	}
	
	
}
