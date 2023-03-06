package com.example.stationdeski.repositories;

import com.example.stationdeski.entites.Inscription;
import com.example.stationdeski.entites.Moniteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoniteurRepository extends JpaRepository<Moniteur, Long> {
}
