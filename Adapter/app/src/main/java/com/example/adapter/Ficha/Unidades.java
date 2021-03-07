package com.example.adapter.Ficha;

import java.util.HashMap;
import java.util.Map;

public class Unidades {
    private Map<String, Double> peso = new HashMap<String, Double>();
    private Map<String, Double> longitud = new HashMap<String, Double>();

    public Unidades(Map<String, Double> peso, Map<String, Double> longitud) {
        this.peso = peso;
        this.longitud = longitud;
    }

    public Map<String, Double> getPeso() {
        return peso;
    }

    public Map<String, Double> getLongitud() {
        return longitud;
    }

    @Override
    public String toString() {
        return "Unidades{" +
                "peso=" + this.getPeso().toString() +
                ", longitud=" + this.getLongitud().toString() +
                '}';
    }
}
