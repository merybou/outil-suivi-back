package com.cs.dao.repository;

import com.cs.dao.Projet;
import com.cs.dao.Sotp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SotpRepository extends JpaRepository<Sotp, Long> {

    public List<Sotp> findByProjet(Projet projet);

}
