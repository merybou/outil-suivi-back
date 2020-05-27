package com.cs.dao;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Column(length = 70)
    private String nom;
    private String prenom;
    private String motDePasse;
    private String login;
    private String role;

    @ManyToMany
    @JoinTable(name = "association",
            joinColumns = @JoinColumn(name = "idCollaborateur"),
            inverseJoinColumns = @JoinColumn(name = "idTache"))
    private List<Tache> taches = new ArrayList<>();


    public Utilisateur() {
    }

    public Utilisateur(String nom, String prenom, String motDePasse, String role, String login) {
        this.nom = nom;
        this.prenom = prenom;
        this.motDePasse = motDePasse;
        this.role = role;
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Tache> getTaches() {
        return taches;
    }

    public void setTaches(List<Tache> taches) {
        this.taches = taches;
    }

}
