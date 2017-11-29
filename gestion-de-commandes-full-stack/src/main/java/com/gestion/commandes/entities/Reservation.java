package com.gestion.commandes.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "RESERVATION")
public class Reservation implements Serializable{

    @EmbeddedId
    private ReservationId pk;
    private boolean isValide;
    @ManyToOne
    @JoinColumn(name = "ID_USER")
    private Utilisateur user;


    public  Reservation(){

    }

    public Reservation(ReservationId pk) {
        this.pk = pk;
        this.isValide = false;
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

    public ReservationId getPk() {
        return pk;
    }

    public void setPk(ReservationId pk) {
        this.pk = pk;
    }

    public boolean isValide() {
        return isValide;
    }

    public void setValide(boolean valide) {
        isValide = valide;
    }
}
