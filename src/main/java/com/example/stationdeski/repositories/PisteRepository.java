package com.example.stationdeski.repositories;

import com.example.stationdeski.entites.Inscription;
import com.example.stationdeski.entites.Piste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PisteRepository extends JpaRepository<Piste, Long> {
}
