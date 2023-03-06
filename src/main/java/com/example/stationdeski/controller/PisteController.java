package com.example.stationdeski.controller;

import com.example.stationdeski.Services.IPisteService;
import com.example.stationdeski.entites.Piste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/piste")
public class PisteController {
    @Autowired
    public IPisteService iPisteService;
    @PostMapping
    public void add  (Piste p)
    {
        iPisteService.add(p);
    }
    @PutMapping
    public void update (Piste p)
    {
        iPisteService.update(p);
    }
    @DeleteMapping
    public void Remove (Piste p)
    {
        iPisteService.Remove(p);
    }
    @GetMapping
    public List<Piste> getAll()
    {
        return iPisteService.getAll();
    }
}
