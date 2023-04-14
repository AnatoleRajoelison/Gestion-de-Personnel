package com.anatole.myproject.Model;

import com.anatole.myproject.*;
import com.anatole.myproject.Enumerateur.PerformanceEmployer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.List;
@Entity
@Table (name = "employé")
@Getter
@Setter
@AllArgsConstructor
public class Employé {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom",length = 50,insertable=false, updatable=false)
    private String nom;
    @Column(length = 50,insertable=false, updatable=false)
    private String prénom;
    @ElementCollection
    private List<Adresse> adresses;
    @ElementCollection
    private List<Cordonnée> cordonnées;
    @Column(length = 100,insertable=false, updatable=false)
    private String poste;
    @Embedded
    private Departement departement;
    private Date dateEmbauche;
    @Embedded
    private Renumeration renumeration;
    @Embedded
    private InformationFiscale informationFiscale;
    @Embedded
    private InformationSecuritéSociale informationSecuritéSociale;
    @Embedded
    private InformationCongé informationCongé;
    @Column(name = "performance",insertable=false, updatable=false)
    @Enumerated(EnumType.STRING)
    private PerformanceEmployer performanceEmployer;
    @Embedded
    private Formation formation;
    @Embedded
    private Image image;

}
