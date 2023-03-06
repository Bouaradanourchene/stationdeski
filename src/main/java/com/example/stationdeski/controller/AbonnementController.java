package com.example.stationdeski.controller;

import com.example.stationdeski.Services.IAbonnementService;
import com.example.stationdeski.entites.Abonnement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/abonnement")//
public class AbonnementController {
    @Autowired
    public IAbonnementService iAbonnementService;
    @PostMapping
    public void add  (Abonnement a)
    {
        iAbonnementService.add(a);
    }
    @PutMapping
    public void update (Abonnement a)
    {
        iAbonnementService.update(a);
    }
    @DeleteMapping
    public void Remove (Abonnement a)
    {
        iAbonnementService.Remove(a);
    }
    @GetMapping
    public List<Abonnement> getAll()
    {
        return iAbonnementService.getAll();
    }

}
