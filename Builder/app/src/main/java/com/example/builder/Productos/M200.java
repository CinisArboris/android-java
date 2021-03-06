package com.example.builder.Productos;
import com.example.builder.Componentes.*;

public class M200 {
    private final Nombre nombre;
    private final Color color;
    private final Peso peso;
    private final Calibre calibre;
    private final Dimensiones dimensiones;
    private final Cargador cargador;
    private final Supresor supresor;
    private final Rifle rifle;
    private final Culata culata;
    private final Accesorio accesorio;

    public Nombre getNombre() {
        return nombre;
    }

    public Color getColor() {
        return color;
    }

    public Peso getPeso() {
        return peso;
    }

    public Calibre getCalibre() {
        return calibre;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }

    public Cargador getCargador() {
        return cargador;
    }

    public Supresor getSupresor() {
        return supresor;
    }

    public Rifle getRifle() {
        return rifle;
    }

    public Culata getCulata() {
        return culata;
    }

    public Accesorio getAccesorio() {
        return accesorio;
    }

    public M200(Nombre nombre, Color color, Peso peso, Calibre calibre, Dimensiones dimensiones, Cargador cargador, Supresor supresor, Rifle rifle, Culata culata, Accesorio accesorio) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.calibre = calibre;
        this.dimensiones = dimensiones;
        this.cargador = cargador;
        this.supresor = supresor;
        this.rifle = rifle;
        this.culata = culata;
        this.accesorio = accesorio;
    }


}
