package com.cs.dao;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Tache implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private Date dateDebut;
    private Date dateFin;
    private int ctp;

    @ManyToOne
    @JoinColumn(name="numeroSotp", nullable = false)
    private Sotp sotp;

    @ManyToMany
    @JoinTable( name = "association",
            joinColumns = @JoinColumn( name = "idTache" ),
            inverseJoinColumns = @JoinColumn( name = "idCollaborateur" ) )
    private List<Utilisateur> collaborateurs = new ArrayList<>();

    public Tache() {
    }

    public Tache(String nom, Date dateDebut, Date dateFin, int ctp, List<Utilisateur> collaborateurs) {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.ctp = ctp;
        this.collaborateurs = collaborateurs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public int getCtp() {
        return ctp;
    }

    public void setCtp(int ctp) {
        this.ctp = ctp;
    }

    public List<Utilisateur> getCollaborateurs() {
        return collaborateurs;
    }

    public void setCollaborateurs(List<Utilisateur> collaborateurs) {
        this.collaborateurs = collaborateurs;
    }
}
