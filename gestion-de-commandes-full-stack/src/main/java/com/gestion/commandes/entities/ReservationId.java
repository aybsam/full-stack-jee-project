package com.gestion.commandes.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class ReservationId implements Serializable  {

    @Temporal(TemporalType.DATE)
    private Date dateReservation;
    private String horaire;
    @ManyToOne
    @JoinColumn(name = "ID_SALLE")
    private Salle salle;

    public ReservationId(Date dateReservation, String horaire, Salle salle) {
        this.dateReservation = dateReservation;
        this.horaire = horaire;
        this.salle = salle;
    }

    public ReservationId() {
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }
    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }
}
