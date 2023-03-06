package com.example.stationdeski.repositories;

import com.example.stationdeski.entites.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository <Inscription , Long>  {
}
