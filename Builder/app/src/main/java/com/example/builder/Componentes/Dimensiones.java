package com.example.builder.Componentes;

import java.util.Vector;

public enum Dimensiones {
    NORMAL(137.16, 43.18, 17.78);
    private final double largo;
    private final double alto;
    private final double ancho;
    
    Dimensiones(double largo, double alto, double ancho) {
        this.largo = largo;
        this.alto = alto;
        this.ancho = ancho;
    }
}
