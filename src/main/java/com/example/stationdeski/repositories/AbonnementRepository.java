package com.example.stationdeski.repositories;

import com.example.stationdeski.entites.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;



public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {

}
