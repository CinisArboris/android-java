package com.example.builder.Componentes;

public enum Peso {
    LIVIANO(13.5), NORMAL(14.1), PESADO(20.1);
    private final double peso;

    Peso(double peso) {
        this.peso = peso;
    }
}
