package com.gesper.gesper.Entite;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class Filiere {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idFiliere;
    private String nom;
    private String DescriptionFil;
    private int nbrMat;
    private String UE;

}
