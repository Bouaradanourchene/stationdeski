package com.example.stationdeski.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Inscription {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   public int numinscription;
   private int numsemaines;
   @ManyToOne
   private  Cours cours;
   @ManyToOne
   @JsonIgnore
   private Skieur Skieur;
}
