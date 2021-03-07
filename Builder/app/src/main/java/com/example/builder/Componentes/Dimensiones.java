package com.example.builder.Componentes;

import java.util.Vector;

public enum Dimensiones {
    M200(54 ,17,7),
    M300(54,17,7),
    HB50(50,17,7),
    MXIX_5000K(54,17,7),
    SAPP(54,17,7);

    public final double largo;
    public final double alto;
    public final double ancho;
    private final double pulgadas_to_centimetro = 2.54;
    
    Dimensiones(double largo, double alto, double ancho) {
        this.largo = largo * this.pulgadas_to_centimetro;
        this.alto = alto * this.pulgadas_to_centimetro;
        this.ancho = ancho * this.pulgadas_to_centimetro;
    }
}
