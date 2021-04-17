package com.example.adapter.SistemaMedidas;

import java.util.HashMap;
import java.util.Map;

public class SistemaIngles {
    public static Map<String, Double> pulgada = new HashMap<String, Double>();
    public static Map<String, Double> libra = new HashMap<String, Double>();

    public static Map<String, Double> getPulgada() {
        return pulgada;
    }

    public static void setPulgada(Map<String, Double> pulgada) {
        SistemaIngles.pulgada = pulgada;
    }

    public static Map<String, Double> getLibra() {
        return libra;
    }

    public static void setLibra(Map<String, Double> libra) {
        SistemaIngles.libra = libra;
    }
}
