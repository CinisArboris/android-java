package com.example.othala.Builder.Constructores;

import com.example.othala.Builder.Molde.FireArm;
import com.example.othala.Builder.Productos.M300;
import com.example.othala.Builder.Componentes.*;
/* B U I L D E R -- I M P L E M E N T A D O R */

public class BuilderM300 implements FireArm {
    private Accesorio accesorio;
    private Calibre calibre;
    private Cargador cargador;
    private Color color;
    private Culata culata;
    private Dimensiones dimensiones;
    private Nombre nombre;
    private Peso peso;

    @Override
    public void setAccesorio(Accesorio accesorio) {
        this.accesorio = accesorio;
    }

    @Override
    public void setCalibre(Calibre calibre) {
        this.calibre = calibre;
    }

    @Override
    public void setCargador(Cargador cargador) {
        this.cargador = cargador;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setCulata(Culata culata) {
        this.culata = culata;
    }

    @Override
    public void setDimensiones(Dimensiones dimensiones) {
        this.dimensiones = dimensiones;
    }

    @Override
    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setPeso(Peso peso) {
        this.peso = peso;
    }

    public M300 getProducto(){
        return new M300(
                this.accesorio,
                this.calibre,
                this.cargador,
                this.color,
                this.culata,
                this.dimensiones,
                this.nombre,
                this.peso
            );
    }
}
