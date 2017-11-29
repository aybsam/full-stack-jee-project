package com.gestion.commandes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.commandes.entities.Salle;

public interface SalleRepository extends JpaRepository<Salle, String>{
}
