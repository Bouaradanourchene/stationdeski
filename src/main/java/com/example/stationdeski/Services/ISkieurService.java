package com.example.stationdeski.Services;

import com.example.stationdeski.entites.Skieur;
import com.example.stationdeski.entites.TypeAbonnement;

import java.util.List;

public interface ISkieurService {
    public void add (Skieur s);
    public void update (Skieur s);
    public void Remove (Skieur s);
    public List<Skieur> getAll();

    Skieur AssignSkieur(long numSkieur, long numPiste);
   List <Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);


}
