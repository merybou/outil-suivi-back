package com.cs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonneEndpoint {

    public PersonneEndpoint() {
    }

    @GetMapping(value="/personne") // définition de l'url
    @ResponseStatus(HttpStatus.OK)
    public Personne getPersonne() {
        Personne personne1 = new Personne("BOUALI","Miriam");
        return personne1;
    }

}
