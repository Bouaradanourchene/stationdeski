package com.example.stationdeski.Services;

import com.example.stationdeski.entites.Abonnement;

import java.util.List;

public interface IAbonnementService {
   public void add(Abonnement a);
   public void update (Abonnement a);
   public void Remove(Abonnement a);
   public List<Abonnement> getAll();


}
