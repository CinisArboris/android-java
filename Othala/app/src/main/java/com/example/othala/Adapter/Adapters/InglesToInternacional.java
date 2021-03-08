package com.example.othala.Adapter.Adapters;

import com.example.othala.Adapter.SistemaMedidas.SistemaIngles;
import com.example.othala.Adapter.SistemaMedidas.SistemaInternacional;

import java.util.HashMap;
import java.util.Map;

public class InglesToInternacional extends SistemaInternacional {
    private SistemaIngles sistemaIngles;

    public InglesToInternacional() {
    }

    public InglesToInternacional(SistemaIngles sistemaIngles) {
        this.sistemaIngles = sistemaIngles;
    }

    public Map<String, Double> libraTOgramo(Map<String, Double> medida_a_sist_ing) {
        Map<String, Double> resultado = new HashMap<String, Double>();
        double cantidad = 0.0;

        cantidad = medida_a_sist_ing.get("lb");
        cantidad = cantidad * 453.592;

        resultado.put("g", cantidad);

        return  resultado;
    }

    public Map<String, Double> pulgadaTOcentimetro(Map<String, Double> medida_b_sist_ing) {
        Map<String, Double> resultado = new HashMap<String, Double>();
        double cantidad = 0.0;

        cantidad = medida_b_sist_ing.get("in");
        cantidad = cantidad * 2.54;

        resultado.put("cm", cantidad);

        return  resultado;
    }

    @Override
    public String toString() {
        return "InglesToInternacional{" +"simbolo=" + this.sistemaIngles +'}';
    }
}
