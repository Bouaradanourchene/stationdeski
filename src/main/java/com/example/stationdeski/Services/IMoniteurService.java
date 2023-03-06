package com.example.stationdeski.Services;

import com.example.stationdeski.entites.Moniteur;

import java.util.List;

public interface IMoniteurService {
    public void add (Moniteur M);
    public void update (Moniteur M);
    public void Remove (Moniteur M);
    public List<Moniteur> getAll();
}
