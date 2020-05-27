package com.cs.dao;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Sotp implements Serializable {

    @Id
    @GeneratedValue
    private Long numero;
    private double budget;
    private Date dateCreation;
    private Date dateModification;
    private int numSalesForce;

    @ManyToOne
    @JoinColumn(name="idProjet", nullable=false)
    @JsonBackReference
    private Projet projet;

    @OneToMany(targetEntity=Tache.class, mappedBy="sotp")
    @JsonManagedReference
    private List<Tache> taches = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "idChefProjet")
    private Utilisateur chefProjet;

    public Sotp() {
    }

    public Sotp(double budget, Date dateCreation, Date dateModification, int numSalesForce, List<Tache> taches, Utilisateur chefProjet) {
        this.budget = budget;
        this.dateCreation = dateCreation;
        this.dateModification = dateModification;
        this.numSalesForce = numSalesForce;
        this.taches = taches;
        this.chefProjet = chefProjet;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateModification() {
        return dateModification;
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }

    public int getNumSalesForce() {
        return numSalesForce;
    }

    public void setNumSalesForce(int numSalesForce) {
        this.numSalesForce = numSalesForce;
    }

    public List<Tache> getTaches() {
        return taches;
    }

    public void setTaches(List<Tache> taches) {
        this.taches = taches;
    }

    public Utilisateur getChefProjet() {
        return chefProjet;
    }

    public void setChefProjet(Utilisateur chefProjet) {
        this.chefProjet = chefProjet;
    }
}
