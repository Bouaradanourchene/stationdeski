package com.example.stationdeski.Services;

import com.example.stationdeski.entites.Abonnement;
import com.example.stationdeski.entites.Cours;

import java.util.List;

public interface ICoursService
{
    public void add(Cours c);
    public void update (Cours c);
    public void Remove(Cours c);
    public List<Cours> getAll();
}
