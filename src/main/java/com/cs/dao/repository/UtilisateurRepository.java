package com.cs.dao.repository;

import com.cs.dao.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {


    public List<Utilisateur> findByLoginAndMotDePasse(@Param("login")String log,@Param("motDePasse") String pass);


}