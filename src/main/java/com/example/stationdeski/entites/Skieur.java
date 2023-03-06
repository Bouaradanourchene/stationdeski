package com.example.stationdeski.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;
@Data

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
 public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSkieur;
    private String nomS;
    private String prenomS;
   @OneToMany(mappedBy = "Skieur")
   @JsonIgnore
   private List <Inscription> inscriptions;
   @ManyToMany(mappedBy = "skieurs")
    @JsonIgnore
   private List <Piste> Pistes;
   @OneToOne
    private Abonnement   abonnement;
}
