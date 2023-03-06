package com.example.stationdeski.controller;

import com.example.stationdeski.Services.ISkieurService;
import com.example.stationdeski.entites.Piste;
import com.example.stationdeski.entites.Skieur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skieur")
public class SkieurController {
    @Autowired
    public ISkieurService iSkieurService;
    @PostMapping
    public void add  (Skieur s)
    {
        iSkieurService.add(s);
    }
    @PutMapping("/piste")
    public void update (Skieur  s)
    {
        iSkieurService.update(s);
    }
    @DeleteMapping
    public void Remove (Skieur  s)
    {
        iSkieurService.Remove(s);
    }
    @GetMapping
    public List<Skieur> getAll()
    {
        return iSkieurService.getAll();
    }
    @PutMapping()
    public Skieur AssignSkieur(long numbSkier, long numPiste) {
        return iSkieurService.AssignSkieur(numbSkier,numPiste);

    }
}
