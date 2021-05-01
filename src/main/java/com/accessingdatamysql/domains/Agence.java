package com.accessingdatamysql.domains;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity(name="agence")
public class Agence {
	@Id
	@Column(nullable = false, length = 25)
	private String nom;
	@Column(nullable = false, length = 25)
	private String codeGuichet;

	@OneToMany(mappedBy="agence", cascade = CascadeType.PERSIST )
	private List<Compte> compte;
	
	@OneToOne()
	private Banque banque;
	
	@OneToOne
	private Adresse Adresse;
	
	public Agence() {

	}


	public Agence(String nom, String codeGuichet) {

		this.nom = nom;
		this.codeGuichet = codeGuichet;
	}
	


	public List<Compte> getCompte() {
		return compte;
	}


	public void setCompte(List<Compte> compte) {
		this.compte = compte;
	}


	public Banque getBanque() {
		return banque;
	}


	public void setBanque(Banque banque) {
		this.banque = banque;
	}


	public Adresse getAdresse() {
		return Adresse;
	}


	public void setAdresse(Adresse adresse) {
		Adresse = adresse;
	}




	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getCodeGuichet() {
		return codeGuichet;
	}


	public void setCodeGuichet(String codeGuichet) {
		this.codeGuichet = codeGuichet;
	}


}
