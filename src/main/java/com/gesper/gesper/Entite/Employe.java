package com.gesper.gesper.Entite;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class Employe {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long IdEmploye;
    private int matricule;
    private String nom;
    private String prenom;
    private int cni;
    private Date date_nais;
    private String lieu_nais;
    private String mail;
    private String genre;
    private int phone;
}
