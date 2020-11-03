package com.isetN.romans.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Roman {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idRoman;
	private String titreRoman;
	private Double prixRoman;
	private Date AnneeEdition;
	
	 
	
	public Roman() {
		super();
		
	}
	
	
	public Roman(String titreRoman, Double prixRoman, Date anneeEdition) {
		super();
		this.titreRoman = titreRoman;
		this.prixRoman = prixRoman;
		AnneeEdition = anneeEdition;
	}
	public long getIdRoman() {
		return idRoman;
	}
	public void setIdRoman(long idRoman) {
		this.idRoman = idRoman;
	}
	public String getTitreRoman() {
		return titreRoman;
	}
	public void setTitreRoman(String titreRoman) {
		this.titreRoman = titreRoman;
	}
	public Double getPrixRoman() {
		return prixRoman;
	}
	public void setPrixRoman(Double prixRoman) {
		this.prixRoman = prixRoman;
	}
	public Date getAnneeEdition() {
		return AnneeEdition;
	}
	public void setAnneeEdition(Date anneeEdition) {
		AnneeEdition = anneeEdition;
	}


	@Override
	public String toString() {
		return "Roman [idRoman=" + idRoman + ", titreRoman=" + titreRoman + ", prixRoman=" + prixRoman
				+ ", AnneeEdition=" + AnneeEdition + "]";
	}
	
	
		
	}


