package com.hamdi.gestionStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamdi.gestionStock.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
