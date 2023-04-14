package com.anatole.myproject;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@Embeddable
public class Cordonnée {
    @Column(name = "emailProfessionnel", columnDefinition = "VARCHAR")
    private String emailProfessionnel;
    @Column(name = "emailPersonnel", columnDefinition = "VARCHAR")
    private String emailPersonnel;
    @Column(name = "telephoneProfessionnel", columnDefinition = "BIGINT")
    private Long telephoneProfessionnel;
    @Column(name = "telephonePersonnel", columnDefinition =  "BIGINT")
    private Long telephonePersonnel;

}
