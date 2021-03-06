package com.example.builder.Componentes;

public enum Peso {
    M200(29),
    M300(55),
    HB50(15),
    MXIX_5000K(18),
    SAPP(15);

    public final double masa;
    private final double libras_to_kilogramo = 2.20462;

    Peso(double masa) {
        this.masa = masa * this.libras_to_kilogramo;
    }
}
