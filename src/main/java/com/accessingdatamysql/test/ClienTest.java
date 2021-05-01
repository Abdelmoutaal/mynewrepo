package com.accessingdatamysql.test;

import java.math.BigDecimal;
import org.springframework.boot.test.context.SpringBootTest;

import com.accessingdatamysql.domains.Adresse;
import com.accessingdatamysql.domains.Agence;
import com.accessingdatamysql.domains.Banque;
import com.accessingdatamysql.domains.Client;
import com.accessingdatamysql.domains.Compte;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


//@SpringBootTest
public class ClienTest {
	

	@Test
	public void contextLoads() {
		List<Compte> cmp = new ArrayList<>();
		
		Client client1=new Client("anes","bz","bz@gmail.com","****",LocalDate.now(),0);
		Adresse adresse_client=new Adresse("rue de grenades","77550","Moissy-cramayel","France");
		Adresse adresse_agence=new Adresse("rue de pontoise","77550","Moissy-cramayel","France");
		Agence agence=new Agence("ag-moissy","13000");
		Banque banque= new Banque("bz-bank","16000");
		Compte compte=new Compte(147258,BigDecimal.valueOf(1000000));
		cmp.add(compte);
		client1.setAdresse(adresse_client);
		client1.setCompte(cmp);		
		agence.setAdresse(adresse_agence);
		agence.setCompte(cmp);
		agence.setBanque(banque);
	}

}