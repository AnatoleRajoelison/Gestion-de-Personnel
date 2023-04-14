package com.anatole.myproject;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
@Embeddable
@Getter
@Setter
@AllArgsConstructor
public class Formation {
    private String nomFormation;
    private String organismeFormation;
    private Date dateDebut;
    private Date dateFin;
}
