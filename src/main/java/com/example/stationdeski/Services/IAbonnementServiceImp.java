package com.example.stationdeski.Services;
import com.example.stationdeski.entites.Abonnement;
import com.example.stationdeski.repositories.AbonnementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Id;
import java.util.List;

@Service
  public class IAbonnementServiceImp implements IAbonnementService {
    @Autowired
    public  AbonnementRepository abonnementRepository;
    @Override
    public void add (Abonnement a){
        abonnementRepository.save(a);
    }
    @Override
    public void update (Abonnement a)
    {
        abonnementRepository.save(a);
    }
    @Override
    public void Remove(Abonnement a){
        abonnementRepository.delete(a);
    }
    @Override
    public List<Abonnement>getAll()
    {
      return abonnementRepository.findAll();
    }
}
