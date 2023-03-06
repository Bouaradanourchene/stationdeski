package com.example.stationdeski.Services;

import com.example.stationdeski.entites.Inscription;

import java.util.List;

public interface IInscriptionService {
    public  void add(Inscription I);
    public void update (Inscription I);
    public void Remove(Inscription I);
    public List<Inscription> getAll();
}
