package com.example.stationdeski.controller;

import com.example.stationdeski.Services.IInscriptionService;
import com.example.stationdeski.entites.Cours;
import com.example.stationdeski.entites.Inscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/inscription")
public class InscriptionController {
    @Autowired
    public IInscriptionService iInscriptionService;
    @PostMapping
    public void add  (Inscription I)
    {
        iInscriptionService.add(I);
    }
    @PutMapping
    public void update (Inscription I)
    {
        iInscriptionService.update(I);
    }
    @DeleteMapping
    public void Remove (Inscription I)
    {
        iInscriptionService.Remove(I);
    }
    @GetMapping
    public List<Inscription> getAll()
    {
        return iInscriptionService.getAll();
    }
}
