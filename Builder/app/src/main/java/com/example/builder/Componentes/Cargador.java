package com.example.builder.Componentes;

public enum Cargador {
    CINCO(5),
    SEIS(6),
    SIETE(7);

    public final double cartuchos;

    Cargador(int cartuchos) {
        this.cartuchos = cartuchos;
    }
}
