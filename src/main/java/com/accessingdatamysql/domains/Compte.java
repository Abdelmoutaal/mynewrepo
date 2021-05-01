package com.accessingdatamysql.domains;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity(name= "compte")
public class Compte {
	
	@Id
	@Column(nullable = false, length = 25)
	private int numero;
	@Column(nullable = false, length = 25)
	private BigDecimal solde;
	@ManyToOne()
	private Agence agence;
	
//	@Column(nullable = false, length = 25)
	
	@ManyToOne
	private Client client;
//	@Column(nullable = false, length = 25)
	

	
	
	
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}



	public Compte(int numero, BigDecimal solde) {
		this.numero = numero;
		this.solde = solde;
		
	}
	
	public Compte() {}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public BigDecimal getSolde() {
		return solde;
	}
	public void setSolde(BigDecimal solde) {
		this.solde = solde;
	}
	public void BigDecimal(BigDecimal solde) {
		this.solde = solde;
	}
	

}
