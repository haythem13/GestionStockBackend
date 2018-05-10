package com.hamdi.gestionStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamdi.gestionStock.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
