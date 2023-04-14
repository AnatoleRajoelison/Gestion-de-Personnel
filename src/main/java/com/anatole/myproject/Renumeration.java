package com.anatole.myproject;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
@Embeddable
@Getter
@Setter
@AllArgsConstructor
public class Renumeration {
    private Double tauxHoraire; // champ pour la renumeration horaire
    private Double tauxJournalière; // champ pour la renumeration journaliere
    private Double tauxMensuel; // champ pour la renumeration mensuelle
    private List<String> avantages;
}
