package com.example.prototype;

import java.util.Objects;

public class Linea extends Container{
    int x;
    int y;

    public Linea() {
    }

    public Linea(Linea linea){
        super(linea);
        if (linea != null){
            this.setX(linea.getX());
            this.setY(linea.getY());
        }
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public Container clone() {
        return new Linea(this);
    }

    public boolean iguales(Object object){
        boolean bandera;
        Linea linea = (Linea) object;
        bandera = (linea.getX() == this.getX()) && (linea.getY() == this.getY());
        return bandera;
    }
}
