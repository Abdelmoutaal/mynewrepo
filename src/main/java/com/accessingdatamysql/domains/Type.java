package com.accessingdatamysql.domains;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Type {
	@Id
	TypeCompte libelle;

	
	public Type() {
	}
	
	public Type(TypeCompte libelle) {
		this.libelle = libelle;
	}

	public TypeCompte getLibelle() {
		return libelle;
	}

	public void setLibelle(TypeCompte libelle) {
		this.libelle = libelle;
	}
	
	
}
