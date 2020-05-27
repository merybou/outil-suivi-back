package com.cs.controller;

import antlr.ASTNULLType;
import com.cs.dao.Projet;
import com.cs.dao.Sotp;
import com.cs.dao.Tache;
import com.cs.dao.repository.ProjetRepository;
import com.cs.dao.repository.SotpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SotpEndpoint {

    @Autowired
    private SotpRepository sotpRepository;

    @Autowired
    private ProjetRepository projetRepository;

    @GetMapping(value="/sotps")
    public List<Sotp> recupererSotpsParNumeroProjet(@RequestParam long numeroProjet) {
        Optional<Projet> projet = projetRepository.findById(numeroProjet);
        List<Sotp> sotps = sotpRepository.findByProjet(projet.get());
        return sotps;
    }

}
