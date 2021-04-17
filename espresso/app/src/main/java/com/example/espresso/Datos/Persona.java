package com.example.espresso.Datos;

public class Persona {
    int persoan_numero;
    String persona_nombre;

    public Persona(int persoan_numero, String persona_nombre) {
        this.persoan_numero = persoan_numero;
        this.persona_nombre = persona_nombre;
    }

    public int getPersoan_numero() { return persoan_numero; }
    public void setPersoan_numero(int persoan_numero) { this.persoan_numero = persoan_numero; }
    public String getPersona_nombre() { return persona_nombre; }
    public void setPersona_nombre(String persona_nombre) { this.persona_nombre = persona_nombre; }

    @Override
    public String toString() { return persona_nombre; }
}
