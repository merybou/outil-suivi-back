package com.cs.controller;

import com.cs.dao.Utilisateur;
import com.cs.dao.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class UtlisateurEndpoint {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @GetMapping(value = "/utilisateur")
    public List<Utilisateur> getUtilisateur() {
        return utilisateurRepository.findAll();

    }

    @GetMapping(value = "/utilisateur/{id}")
    public Utilisateur getUtilisateur(@PathVariable Long id) {
        return utilisateurRepository.findById(id).orElse(null);

    }

    @PostMapping(value = "/utilisateur")
    public Utilisateur save(@RequestBody Utilisateur u) {
        return utilisateurRepository.save(u);
    }

    @PutMapping(value = "/utilisateur/{id}")
    public Utilisateur update(@PathVariable Long id, @RequestBody Utilisateur utilisateurAMettreAJour) {

        Utilisateur utilisateurASauvegarder = utilisateurRepository.findById(id).orElse(null);
        utilisateurASauvegarder.setNom(utilisateurAMettreAJour.getNom());
        utilisateurASauvegarder.setPrenom(utilisateurAMettreAJour.getPrenom());
        utilisateurASauvegarder.setMotDePasse(utilisateurAMettreAJour.getMotDePasse());


        return utilisateurRepository.save(utilisateurASauvegarder);
    }

    @DeleteMapping(value = "/utilisateur/{id}")
    public void supprimer(@PathVariable Long id) {
        utilisateurRepository.deleteById(id);
    }

    @PostMapping(value = "/connection")
    public boolean connection(@RequestBody Utilisateur ut) {
        List<Utilisateur> u = utilisateurRepository.findByLoginAndMotDePasse(ut.getLogin(), ut.getMotDePasse());
        if (u != null && u.size() > 0) {
            return true;
        } else return false;
    }
}
