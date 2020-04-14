package com.cs.dao.repository;

import com.cs.dao.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
//    @Query("select u from Utilisateur u where u.nom like :x")
//    public List<Utilisateur> utilisateursParMc(@Param("x")String mc);
}
