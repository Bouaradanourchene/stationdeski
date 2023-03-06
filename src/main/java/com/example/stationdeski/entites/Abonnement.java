package com.example.stationdeski.entites;

import lombok.*;

import javax.persistence.*;
import java.text.DateFormat;
import java.time.LocalDate;
@Data
@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long numAbonnement;
    public DateFormat dateDebut;
    public LocalDate dateFin;
    public int prixAbonnement;
    @Enumerated(EnumType.STRING)
    public TypeAbonnement typeAbonnement;
}
