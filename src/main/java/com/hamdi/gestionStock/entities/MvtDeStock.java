package com.hamdi.gestionStock.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class MvtDeStock implements Serializable{
	public static final int ENTREE=1;
	public static final int SORTIE=2;
	
	@Id
	@GeneratedValue
	private long idMvtStk;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMvt;
	
	private BigDecimal quantite;
	
	private int typeMvt;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article ;
	
	

	public MvtDeStock(Date dateMvt, BigDecimal quantite, int typeMvt, Article article) {
		super();
		this.dateMvt = dateMvt;
		this.quantite = quantite;
		this.typeMvt = typeMvt;
		this.article = article;
	}

	public MvtDeStock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getIdMvtStk() {
		return idMvtStk;
	}

	public void setIdMvtStk(long idMvtStk) {
		this.idMvtStk = idMvtStk;
	}

	public Date getDateMvt() {
		return dateMvt;
	}

	public void setDateMvt(Date dateMvt) {
		this.dateMvt = dateMvt;
	}

	public BigDecimal getQuantite() {
		return quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public int getTypeMvt() {
		return typeMvt;
	}

	public void setTypeMvt(int typeMvt) {
		this.typeMvt = typeMvt;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	} 
	
	
	
}
