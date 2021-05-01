package com.accessingdatamysql.repository;

import org.springframework.data.repository.CrudRepository;

import com.accessingdatamysql.domains.Compte;



public interface CompteRepository extends CrudRepository<Compte, Integer> {

}