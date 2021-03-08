package com.example.othala.Adapter.RegionSI;

import java.util.HashMap;
import java.util.Map;

public class RegionSI {
    private Map<String, Double> clave_valor = new HashMap<String, Double>();

    public RegionSI(Map<String, Double> clave_valor) {
        this.clave_valor = clave_valor;
    }

    public Map<String, Double> getClave_valor() {
        return clave_valor;
    }
}
