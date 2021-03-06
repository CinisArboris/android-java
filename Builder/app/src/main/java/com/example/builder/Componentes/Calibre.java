package com.example.builder.Componentes;

public enum Calibre {
    TACTICAL(.408), INTERVENTION(.375);
    private final double calibre;

    Calibre(double calibre) {
        this.calibre = calibre;
    }
}
