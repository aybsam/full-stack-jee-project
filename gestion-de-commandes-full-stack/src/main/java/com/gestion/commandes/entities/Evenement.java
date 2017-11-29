package com.gestion.commandes.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "EVENEMENT")
public class Evenement implements Serializable{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEven;
    private String theme;
    @Temporal(TemporalType.DATE)
    private Date dateEven;
    private boolean isValide;
    @ManyToOne
    @JoinColumn(name = "ID_SALLE")
    private Salle salle;
    @ManyToOne
    @JoinColumn(name = "ID_USER")
    private Utilisateur user;

    public Evenement(){

    }

    public Evenement(String theme, Date dateEven, Salle salle) {
        this.theme = theme;
        this.dateEven = dateEven;
        this.salle = salle;
        this.isValide = false;
    }

    public Long getIdEven() {
        return idEven;
    }

    public void setIdEven(Long idEven) {
        this.idEven = idEven;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Date getDateEven() {
        return dateEven;
    }

    public void setDateEven(Date dateEven) {
        this.dateEven = dateEven;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

    public boolean isValide() {
        return isValide;
    }

    public void setValide(boolean valide) {
        isValide = valide;
    }
}
