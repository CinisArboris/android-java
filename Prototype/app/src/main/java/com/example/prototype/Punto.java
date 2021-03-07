package com.example.prototype;

import java.util.Objects;

public class Punto extends Container{
    int x;

    public Punto() {
    }

    public Punto(Punto punto) {
        super(punto);
        if (punto != null){
            this.setX(punto.getX());
        }
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public Container clone() {
        return new Punto(this);
    }

    public boolean iguales(Object object){
        boolean bandera;
        Punto punto = (Punto) object;
        bandera = punto.getX() == this.getX();
        return bandera;
    }
}
