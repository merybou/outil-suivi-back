package com.cs.controller;

import com.cs.dao.Tache;
import com.cs.dao.repository.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TacheEndpoint {

    @Autowired
    TacheRepository tacheRepository;

    @GetMapping(value="/taches")
    @ResponseStatus(HttpStatus.OK)
    public List<Tache> getTaches() {
        List<Tache> taches = tacheRepository.findAll();
        return taches;
    }

}
