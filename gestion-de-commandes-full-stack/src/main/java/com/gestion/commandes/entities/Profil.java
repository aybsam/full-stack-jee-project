package com.gestion.commandes.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "PROFIL")
public class Profil implements Serializable {

    @Id
    private String profil;
    private String description;
    @OneToMany(mappedBy = "profil")
    private List<Utilisateur> users;

    public Profil() {
    }

    public Profil(String profil, String description) {
        this.profil = profil;
        this.description = description;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
