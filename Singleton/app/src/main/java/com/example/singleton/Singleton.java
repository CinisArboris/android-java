package com.example.singleton;

import java.sql.SQLOutput;

public class Singleton {
    public Singleton singleton;
    public int randonNumber;

    public Singleton() {
        this.setRandonNumber((int) (Math.random()*10)+10);
    }

    public Singleton getSingleton() {
        return singleton;
    }
    public void setSingleton(Singleton singleton) {
        this.singleton = singleton;
    }
    public int getRandonNumber() {
        return randonNumber;
    }

    public void setRandonNumber(int randonNumber) {
        this.randonNumber = randonNumber;
    }

    public Singleton getInstanciaSingleton(){
        if (this.getSingleton() == null){
            this.setSingleton(new Singleton());
            System.out.println("Singleton() creado :D !!!");
        }
        return this.getSingleton();
    }
}
