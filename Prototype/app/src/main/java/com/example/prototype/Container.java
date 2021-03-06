package com.example.prototype;

public abstract class Container {
    public Container() {
    }

    public Container(Container container){
    }

    public abstract Container clone();

    public boolean iguales(Object object){
        boolean bandera;
        if (!(object instanceof Container)){
            bandera = false;
            return bandera;
        }
        bandera = this.equals(object);
        return bandera;
    };
}
