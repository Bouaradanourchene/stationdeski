package com.example.stationdeski.Services;

import com.example.stationdeski.entites.Piste;
import com.example.stationdeski.repositories.PisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IPisteServiceImp implements IPisteService{
    @Autowired
    public PisteRepository pisteRepository;
    @Override
    public void add (Piste p)
    {
        pisteRepository.save(p);
    }
    @Override
    public void update (Piste p){
        pisteRepository.save(p);
    }
    @Override
    public void Remove (Piste p)
    {
        pisteRepository.delete(p);
    }
    @Override
    public List<Piste> getAll()
    {
        return  pisteRepository.findAll();
    }
}
