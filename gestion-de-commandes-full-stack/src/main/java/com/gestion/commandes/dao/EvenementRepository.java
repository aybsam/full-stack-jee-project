package com.gestion.commandes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.commandes.entities.Evenement;

public interface EvenementRepository extends JpaRepository<Evenement, Long>{
}
