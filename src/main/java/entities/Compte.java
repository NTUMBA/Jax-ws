package entities;


import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlAccessType;





@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Compte {
	private String nomCompte;
	private Long code;
	private Float solde;
	@XmlTransient
	private Date dateCreation;

	// CONSTRUCTEUR
	public Compte(String nomCompte, Long code, Float solde, Date dateCreation) {
		super();
		this.nomCompte = nomCompte;
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}

	public Compte() {

	}

	
	

	// GETTERS ET SETTERS
	public String getNomCompte() {
		return nomCompte;
	}

	public void setNomCompte(String nomCompte) {
		this.nomCompte = nomCompte;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public Float getSolde() {
		return solde;
	}

	public void setSolde(Float solde) {
		this.solde = solde;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


}



