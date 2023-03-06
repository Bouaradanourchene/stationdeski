package com.example.stationdeski.controller;

import com.example.stationdeski.Services.IInscriptionService;
import com.example.stationdeski.Services.IMoniteurService;
import com.example.stationdeski.Services.IPisteService;
import com.example.stationdeski.entites.Inscription;
import com.example.stationdeski.entites.Moniteur;
import com.example.stationdeski.entites.Piste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/moniteur")
public class MoniteurController {
    @Autowired
    public IMoniteurService iMoniteurService;
    @PostMapping
    public void add  (Moniteur m)
    {
        iMoniteurService.add(m);
    }
    @PutMapping
    public void update (Moniteur m)
    {
        iMoniteurService.update(m);
    }
    @DeleteMapping
    public void Remove (Moniteur m)
    {
        iMoniteurService.Remove(m);
    }
    @GetMapping
    public List<Moniteur> getAll()
    {
        return iMoniteurService.getAll();
    }

}
