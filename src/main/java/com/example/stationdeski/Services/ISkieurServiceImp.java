package com.example.stationdeski.Services;

import com.example.stationdeski.entites.Piste;
import com.example.stationdeski.entites.Skieur;
import com.example.stationdeski.entites.TypeAbonnement;
import com.example.stationdeski.repositories.PisteRepository;
import com.example.stationdeski.repositories.SkieurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
public class ISkieurServiceImp implements ISkieurService {
    @Autowired
    public SkieurRepository skieurRepository;
    public PisteRepository pisteRepo;
    @Override
    public void add (Skieur s)
    {
        skieurRepository.save(s);
    }
    @Override
    public void update (Skieur s){
        skieurRepository.save(s);
    }
    @Override
    public void Remove (Skieur s)
    {
        skieurRepository.delete(s);
    }
    @Override
    public List<Skieur> getAll()
    {
        return  skieurRepository.findAll();
    }
    @Override
    public Skieur AssignSkieur(long numSkieur, long numPiste) {
        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        Assert.notNull(skieur,"skieur not found ");
        Piste piste = pisteRepo.findById(numPiste).orElse(null);
        Assert.notNull(piste,"404");
        /*Set<Piste> pistes = skieur.getPistes();
            pistes.add(piste);
            skieur.setPistes(pistes);*/
        skieur.getPistes().add(piste);
        return skieurRepository.save(skieur);

    }
  //  @Override
    /*
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement){
        List<Skieur>List =new ArrayList<>();
        for(Skieur s:getAll())
        {
            if(s.getAbonnement().getTypeAbon().eqauls( typeAbonnement)){
                List.add(s);
            }
        }
        return List;

    }*/
    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement)
    {
        return skieurRepository.findByAbonnementTypeAbonnement(typeAbonnement);
    }


}
