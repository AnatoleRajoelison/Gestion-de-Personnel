package com.anatole.myproject;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Adresse {
    @Column(name = "numeroRue", columnDefinition = "VARCHAR")
    private String numeroRue;
    @Column (name = "nomRue", columnDefinition = "VARCHAR")
    private String nomRue;
    @Column(name = "codePostal", columnDefinition = "VARCHAR")
    private String codePostal;
    @Column(name = "ville", columnDefinition = "VARCHAR")
    private String ville;
    @Column(name = "pays", columnDefinition = "VARCHAR")
    private String pays;
}
