package com.example.singleton;

import java.sql.SQLOutput;

public class Singleton {
    private static Singleton singleton;
    private int randonNumber;/*Variable de prueba : número randon*/

    private Singleton() {
        this.setRandonNumber((int) (Math.random()*10)+10);
    }

    public int getRandonNumber() {
        return randonNumber;
    }
    public void setRandonNumber(int randonNumber) {
        this.randonNumber = randonNumber;
    }

    public static Singleton getInstanciaSingleton(){
        if (singleton == null){
            singleton = new Singleton();
            System.out.println("Singleton() creado :D !!!");
        }
        return singleton;
    }
}
