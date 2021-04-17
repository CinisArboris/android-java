package com.example.othala.Adapter.SistemaMedidas;

import java.util.HashMap;
import java.util.Map;

public class SistemaInternacional {
    private static Map<String, Double> metro = new HashMap<String, Double>();
    private static Map<String, Double> centimetro = new HashMap<String, Double>();
    private static Map<String, Double> milimetro = new HashMap<String, Double>();
    private static Map<String, Double> kilogramo = new HashMap<String, Double>();

    public static Map<String, Double> getMetro() {
        return metro;
    }

    public static void setMetro(Map<String, Double> metro) {
        SistemaInternacional.metro = metro;
    }

    public static Map<String, Double> getCentimetro() {
        return centimetro;
    }

    public static void setCentimetro(Map<String, Double> centimetro) {
        SistemaInternacional.centimetro = centimetro;
    }

    public static Map<String, Double> getMilimetro() {
        return milimetro;
    }

    public static void setMilimetro(Map<String, Double> milimetro) {
        SistemaInternacional.milimetro = milimetro;
    }

    public static Map<String, Double> getKilogramo() {
        return kilogramo;
    }

    public static void setKilogramo(Map<String, Double> kilogramo) {
        SistemaInternacional.kilogramo = kilogramo;
    }
}
