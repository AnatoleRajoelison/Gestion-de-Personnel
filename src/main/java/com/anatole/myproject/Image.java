package com.anatole.myproject;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Image {
    @Lob
    private byte[]image;

    public Image(byte[] image) {
        this.image = image;
    }
}
