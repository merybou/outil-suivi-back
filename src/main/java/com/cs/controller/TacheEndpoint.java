package com.cs.controller;

import com.cs.dao.Tache;
import com.cs.dao.repository.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TacheEndpoint {

    @Autowired
    TacheRepository tacheRepository;

    @GetMapping(value="/taches")
    public List<Tache> recupererTaches() {
        List<Tache> taches = tacheRepository.findAll();
        return taches;
    }

    @PostMapping(value = "/tache")
    @ResponseStatus(HttpStatus.CREATED)
    public Tache creerTache(@RequestBody Tache tache) {
        return tacheRepository.save(tache);
    }

    @PutMapping(value = "/tache")
    public Tache mettreAJourTache(@RequestBody Tache tache) {
        return tacheRepository.save(tache);
    }

    @DeleteMapping(value = "/tache/{idTache}")
    public void supprimerTache(@PathVariable long idTache) {
        tacheRepository.deleteById(idTache);
    }

}
