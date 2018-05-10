package com.hamdi.gestionStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamdi.gestionStock.entities.CommandeClient;

public interface CommandeClientRepository extends JpaRepository<CommandeClient, Long> {

}
