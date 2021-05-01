package com.accessingdatamysql.domains;

import java.beans.Transient;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="client")
public class Client {

	@Column(nullable = false, length = 25)
	private String prenom;
	@Column(nullable = false, length = 25)
	private String nom;
	@Id
	@Column(nullable = false, length = 25)
	private String email;
	@Column(nullable = false, length = 40)
	private String mdp;
	private LocalDate ddn;
	private int age;
	
	@OneToMany(targetEntity=Compte.class ,cascade = CascadeType.ALL)
	@JoinColumn(name="email_compte",referencedColumnName = "email")
	private List<Compte> compte;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Adresse adresse;
	
	public Client() {}
	
	
	public Client(String prenom, String nom, String email, String mdp, LocalDate ddn, int age) {
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.mdp = mdp;
		this.ddn = ddn;
		this.age = age;
	}
	
	
	
	public List<Compte> getCompte() {
		return compte;
	}


	public void setCompte(List<Compte> compte) {
		this.compte = compte;
	}


	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public LocalDate getDdn() {
		return ddn;
	}
	public void setDdn(LocalDate ddn) {
		this.ddn = ddn;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
