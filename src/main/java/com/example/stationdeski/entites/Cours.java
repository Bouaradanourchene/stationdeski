package com.example.stationdeski.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numCours;
   private int niveau;
    @Enumerated(EnumType.STRING)
     TypeCours typecours;
    @Enumerated(EnumType.STRING)
    Support support;
    private float prix;
    private int creneau;
    @OneToMany(mappedBy = "cours")
    @JsonIgnore
    private List<Inscription> Inscriptions;

}
