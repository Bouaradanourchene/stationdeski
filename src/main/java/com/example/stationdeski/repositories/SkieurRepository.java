package com.example.stationdeski.repositories;

import com.example.stationdeski.entites.Skieur;
import com.example.stationdeski.entites.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur, Long> {
      public List<Skieur> findByAbonnementTypeAbonnement(TypeAbonnement typeAbonnement);

}
