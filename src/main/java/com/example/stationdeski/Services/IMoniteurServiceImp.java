package com.example.stationdeski.Services;

import com.example.stationdeski.entites.Moniteur;
import com.example.stationdeski.repositories.MoniteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IMoniteurServiceImp implements IMoniteurService{
    @Autowired
    public MoniteurRepository moniteurRepository;
    @Override
    public void add(Moniteur M) {
        moniteurRepository.save(M);    }

    @Override
    public void update(Moniteur M) {
        moniteurRepository.save(M);
    }

    @Override
    public void Remove(Moniteur M) {
        moniteurRepository.delete(M);
    }

    @Override
    public List<Moniteur> getAll() {
        return moniteurRepository.findAll();
    }
}
