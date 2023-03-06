package com.example.stationdeski.Services;

import com.example.stationdeski.entites.Moniteur;
import com.example.stationdeski.entites.Piste;

import java.util.List;

public interface IPisteService {
    public void add (Piste p);
    public void update (Piste p);
    public void Remove (Piste p);
    public List<Piste> getAll();
}
