package com.example.builder.Constructores;

import com.example.builder.Molde.FireArm;
import com.example.builder.Productos.M200;
import com.example.builder.Componentes.*;

public class BuilderM200 implements FireArm {
    private Nombre nombre;
    private Color color;
    private Peso peso;
    private Calibre calibre;
    private Dimensiones dimensiones;
    private Cargador cargador;
    private Supresor supresor;
    private Rifle rifle;
    private Culata culata;
    private Accesorio accesorio;

    @Override
    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setPeso(Peso peso) {
        this.peso = peso;
    }

    @Override
    public void setCalibre(Calibre calibre) {
        this.calibre = calibre;
    }

    @Override
    public void setDimensiones(Dimensiones dimensiones) {
        this.dimensiones = dimensiones;
    }

    @Override
    public void setCargador(Cargador cargador) {
        this.cargador = cargador;
    }

    @Override
    public void setSupresor(Supresor supresor) {
        this.supresor = supresor;
    }

    @Override
    public void setRifle(Rifle rifle) {
        this.rifle = rifle;
    }

    @Override
    public void setCulata(Culata culata) {
        this.culata = culata;
    }

    @Override
    public void setAccesorio(Accesorio accesorio) {
        this.accesorio = accesorio;
    }

    public M200 getProducto(){
        return new M200(nombre, color, peso, calibre, dimensiones, cargador, supresor, rifle, culata, accesorio);
    }
}
