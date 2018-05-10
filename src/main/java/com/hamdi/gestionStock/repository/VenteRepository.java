package com.hamdi.gestionStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamdi.gestionStock.entities.Vente;

public interface VenteRepository extends JpaRepository<Vente, Long>{

}
