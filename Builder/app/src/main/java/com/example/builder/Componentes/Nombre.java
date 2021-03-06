package com.example.builder.Componentes;

public enum Nombre {
    M200("Intervention"),
    M300("Praetorian Composite"),
    HB50("Paladin"),
    MXIX_5000K("Perses"),
    SAPP("SAPP");

    public final String categoria;

    Nombre(String categoria) {
        this.categoria = categoria;
    }
}
