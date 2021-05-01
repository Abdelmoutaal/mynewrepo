package com.accessingdatamysql.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adresse {
	
	@Id
	@Column(nullable = false, length = 25)
	private String voie;
	@Column(nullable = false, length = 25)
	private String codePostal;
	@Column(nullable = false, length = 25)
	private String ville;
	@Column(nullable = false, length = 25)
	private String pays;
	
	public Adresse() {}
	
	public Adresse(String voie, String codePostal, String ville, String pays) {
		this.voie = voie;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}
	
	public String getVoie() {
		return voie;
	}
	public void setVoie(String voie) {
		this.voie = voie;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	

}
