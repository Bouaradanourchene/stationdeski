package com.example.stationdeski.Services;
import com.example.stationdeski.entites.Inscription;
import com.example.stationdeski.repositories.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IInscriptionServiceImp implements IInscriptionService {
@Autowired
       public InscriptionRepository inscriptionRepository ;
@Override
    public  void add(Inscription I)
    {
        inscriptionRepository.save(I);

    }
    @Override
    public void update (Inscription I)
    {

        inscriptionRepository.save(I);
    }
    @Override
    public void Remove(Inscription I){
        inscriptionRepository.delete(I);
    }
    @Override
    public List<Inscription> getAll()
    {
       return inscriptionRepository.findAll();
    }
}
