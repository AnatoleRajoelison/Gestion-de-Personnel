package com.anatole.myproject;

import com.anatole.myproject.Enumerateur.Congé;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.time.LocalDate;
@Embeddable
@Getter
@Setter
public class InformationCongé {
    private LocalDate debut;
    private LocalDate fin;
    @Column(name = "congé")
    @Enumerated(EnumType.STRING)
    private Congé congé;
    private boolean approuve;

    public InformationCongé(LocalDate debut, LocalDate fin, Congé congé) {
        this.debut = debut;
        this.fin = fin;
        this.congé = congé;
        this.approuve = false; // le congé n'est pas approuvé par defaut
    }
}

