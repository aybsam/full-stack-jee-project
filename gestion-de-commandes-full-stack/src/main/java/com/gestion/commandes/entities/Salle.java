package com.gestion.commandes.entities;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "SALLE")
public class Salle implements Serializable{

    @Id
    private String numSalle;
    private int capacite;
    private boolean isReserved;
    @ManyToOne @JsonIgnore
    @JoinColumn(name="ID_EVENEMENT")
    private Evenement evenement;

    public Salle() {
    }

    public Salle(String numSalle, int capacite) {
        this.numSalle = numSalle;
        this.capacite = capacite;
        this.isReserved = false;
    }


    public String getNumSalle() {
        return numSalle;
    }

    public void setNumSalle(String numSalle) {
        this.numSalle = numSalle;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public Evenement getEvenement() {
        return evenement;
    }

    public void setEvenement(Evenement evenement) {
        this.evenement = evenement;
    }


}
