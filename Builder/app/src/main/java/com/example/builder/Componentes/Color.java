package com.example.builder.Componentes;

public enum Color {
    BLACK("Negro"),
    FLAT_DARK_EARTH("Tierra oscura plana"),
    GREEN("Verde"),
    ARMOR_BLACK("Armadura Negra"),
    SNIPER_GREY("Gris Francotirador");

    public final String camuflaje;

    Color(String camuflaje) {
        this.camuflaje = camuflaje;
    }
}
