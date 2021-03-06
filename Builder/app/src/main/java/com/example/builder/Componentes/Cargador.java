package com.example.builder.Componentes;

public enum Cargador {
    TACTICAL(7), INTERVENTION(5);
    private final double cartuchos;

    Cargador(int cartuchos) {
        this.cartuchos = cartuchos;
    }
}
