package com.example.othala.Builder.Componentes;

public enum Calibre {
    M200_A(.408),
    M200_B(.375),
    M300_A(.408),
    M300_B(.375),
    HB50(.300),
    MXIX_5000K(.300),
    SAPP(.308);

    public final double longitud;
    //private final double pulgadas_to_milimetros = 25.4;

    Calibre(double longitud) {
        this.longitud = longitud;// * this.pulgadas_to_milimetros;
    }
}
