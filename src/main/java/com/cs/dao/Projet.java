package com.cs.dao;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Projet implements Serializable {

    @Id
//    @GeneratedValue
    private long numero;
    private String libelle;
    private String client;
    private Date dateDebut;
    private Date dateFin;

    @OneToMany(targetEntity = Sotp.class, mappedBy = "projet")
    @JsonManagedReference
    private List<Sotp> sotps = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "idChefProjet")
    private Utilisateur chefProjet;

    public Projet() {
    }

    public Projet(String libelle, String client, Date dateDebut, Date dateFin, List<Sotp> sotps, Utilisateur chefProjet) {
        this.libelle = libelle;
        this.client = client;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.sotps = sotps;
        this.chefProjet = chefProjet;
    }


    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public List<Sotp> getSotps() {
        return sotps;
    }

    public void setSotps(List<Sotp> sotps) {
        this.sotps = sotps;
    }

    public Utilisateur getChefProjet() {
        return chefProjet;
    }

    public void setChefProjet(Utilisateur chefProjet) {
        this.chefProjet = chefProjet;
    }

}
