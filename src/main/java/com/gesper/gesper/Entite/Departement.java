package com.gesper.gesper.Entite;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class Departement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdDep;
    private String nomDep;
    private String Abrev;
    private String DescriptionDep;
    private int nbrfiliere;
    private int nbremploye;


}
