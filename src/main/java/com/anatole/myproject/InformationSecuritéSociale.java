package com.anatole.myproject;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
@Embeddable
@Getter
@Setter
@AllArgsConstructor
public class InformationSecuritéSociale {
    private String numeroSecuriterSociale;
    private LocalDate dateEntrer;
}
