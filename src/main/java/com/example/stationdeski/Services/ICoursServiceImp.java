package com.example.stationdeski.Services;

import com.example.stationdeski.entites.Cours;
import com.example.stationdeski.repositories.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICoursServiceImp implements ICoursService {
    @Autowired
    public CoursRepository coursRepository ;
    @Override
    public void add(Cours c){
        coursRepository.save(c);
    }
    @Override
    public void update (Cours c){
        coursRepository.save(c);
    }
    @Override
    public void Remove(Cours c){
        coursRepository.delete(c);
    }
    public List<Cours> getAll(){
        return coursRepository.findAll();
    }


}
