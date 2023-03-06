package com.example.stationdeski.controller;

import com.example.stationdeski.Services.ICoursService;
import com.example.stationdeski.entites.Cours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cours")
public class CoursController {
    @Autowired
    public ICoursService iCoursService ;
    @PostMapping
    public void add  (Cours c)
    {
        iCoursService.add(c);
    }
    @PutMapping
    public void update (Cours c)
    {
        iCoursService.update(c);
    }
    @DeleteMapping
    public void Remove (Cours c)
    {
        iCoursService.Remove(c);
    }
    @GetMapping
    public List<Cours> getAll()
    {
        return iCoursService.getAll();
    }
}
