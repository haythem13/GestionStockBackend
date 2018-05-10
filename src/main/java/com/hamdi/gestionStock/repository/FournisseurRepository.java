package com.hamdi.gestionStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamdi.gestionStock.entities.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Long>{

}
