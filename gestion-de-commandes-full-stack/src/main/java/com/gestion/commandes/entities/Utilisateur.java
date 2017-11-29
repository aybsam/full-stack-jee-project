package com.gestion.commandes.entities;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "UTILISATEUR")
public class Utilisateur {

    @Id
    private String cin;
    private String nom;
    private String prenom;
    private String email;
    private String username;
    private String passwowrd;
    @ManyToOne
    @JoinColumn(name = "ID_PROFIL")
    private Profil profil;
    @OneToMany(mappedBy = "user")
    private List<Reservation> reservations;

    public Utilisateur() {
    }

    public Utilisateur(String cin, String nom, String prenom, String email, String username, String passwowrd, Profil profil) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.username = username;
        this.passwowrd = passwowrd;
        this.profil = profil;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswowrd() {
        return passwowrd;
    }

    public void setPasswowrd(String passwowrd) {
        this.passwowrd = passwowrd;
    }

    public Profil getProfil() {
        return profil;
    }

    public void setProfil(Profil profil) {
        this.profil = profil;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

}
