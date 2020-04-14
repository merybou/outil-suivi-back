package com.cs.dao;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Rapport implements Serializable {

    @Id
    @GeneratedValue
    private Long numero;
    private String lundi;
    private String mardi;
    private String mercredi;
    private String jeudi;
    private String vendredi;
    private int ctc;
    private int raf;
    private int rap;
    private int gain;
    private  int perte;
    private String statut;
    private String commentaire;

    @OneToOne
    @JoinColumn(name="idTache", nullable=false)
    private Tache tache;

    public Rapport() {
    }

    public Rapport(String lundi, String mardi, String mercredi, String jeudi, String vendredi, int ctc, int raf,
                   int rap, int gain, int perte, String statut, String commentaire, Tache tache) {
        this.lundi = lundi;
        this.mardi = mardi;
        this.mercredi = mercredi;
        this.jeudi = jeudi;
        this.vendredi = vendredi;
        this.ctc = ctc;
        this.raf = raf;
        this.rap = rap;
        this.gain = gain;
        this.perte = perte;
        this.statut = statut;
        this.commentaire = commentaire;
        this.tache = tache;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getLundi() {
        return lundi;
    }

    public void setLundi(String lundi) {
        this.lundi = lundi;
    }

    public String getMardi() {
        return mardi;
    }

    public void setMardi(String mardi) {
        this.mardi = mardi;
    }

    public String getMercredi() {
        return mercredi;
    }

    public void setMercredi(String mercredi) {
        this.mercredi = mercredi;
    }

    public String getJeudi() {
        return jeudi;
    }

    public void setJeudi(String jeudi) {
        this.jeudi = jeudi;
    }

    public String getVendredi() {
        return vendredi;
    }

    public void setVendredi(String vendredi) {
        this.vendredi = vendredi;
    }

    public int getCtc() {
        return ctc;
    }

    public void setCtc(int ctc) {
        this.ctc = ctc;
    }

    public int getRaf() {
        return raf;
    }

    public void setRaf(int raf) {
        this.raf = raf;
    }

    public int getRap() {
        return rap;
    }

    public void setRap(int rap) {
        this.rap = rap;
    }

    public int getGain() {
        return gain;
    }

    public void setGain(int gain) {
        this.gain = gain;
    }

    public int getPerte() {
        return perte;
    }

    public void setPerte(int perte) {
        this.perte = perte;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Tache getTache() {
        return tache;
    }

    public void setTache(Tache tache) {
        this.tache = tache;
    }
}
