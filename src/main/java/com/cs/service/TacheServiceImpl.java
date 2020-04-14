package com.cs.service;

import com.cs.dao.Tache;
import com.cs.dao.repository.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TacheServiceImpl implements TacheService {

    @Autowired
    private TacheRepository tacheRepository;

    public void creerTache(Tache tache) {

    }
}
