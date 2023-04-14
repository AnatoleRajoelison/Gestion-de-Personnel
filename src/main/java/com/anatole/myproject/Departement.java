package com.anatole.myproject;

import jakarta.persistence.*;

@Embeddable
public class Departement {
    private String nom;
    private String code;
}
