package com.gestion.commandes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.commandes.entities.Reservation;
import com.gestion.commandes.entities.ReservationId;

public interface ReservationRepository extends JpaRepository<Reservation, ReservationId>{


}

