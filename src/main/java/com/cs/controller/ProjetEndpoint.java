package com.cs.controller;

import com.cs.dao.Projet;
import com.cs.dao.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjetEndpoint {

    @Autowired
    ProjetRepository projetRepository;

    @GetMapping(value="/projet")
    public List<Projet> recupererProjets() {
        List<Projet> projet = projetRepository.findAll();
        return projet;
    }

    @PostMapping(value = "/projet")
    @ResponseStatus(HttpStatus.CREATED)
    public Projet creerProjet(@RequestBody Projet projet) {
        return projetRepository.save(projet);
    }

    @PutMapping(value = "/projet")
    public Projet mettreAJourProjet(@RequestBody Projet projet) {
        return projetRepository.save(projet);
    }

    @DeleteMapping(value = "/projet/{numeroProjet}")
    public void supprimerProjet(@PathVariable long numeroProjet) {
        projetRepository.deleteById(numeroProjet);
    }

}
