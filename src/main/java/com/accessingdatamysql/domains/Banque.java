package com.accessingdatamysql.domains;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Banque {
	
	@Id
	@Column(nullable = false, length = 25)
	private String nom;
	@Column(nullable = false, length = 25)
	private String code;

//	private Adresse adresse;

	
	
	public Banque(String nom, String code) {
		this.nom = nom;
		this.code = code;
	}
	
	public Banque() {	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
		
	

}
