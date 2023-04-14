package com.anatole.myproject;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Embeddable
@Getter
@Setter
@AllArgsConstructor
public class InformationFiscale {
    private String numeroSecuriteSociale;
    private String codeFiscalite;
    private double tauxImpots;
}
