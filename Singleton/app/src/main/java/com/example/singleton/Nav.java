package com.example.singleton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Nav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        Singleton creador = new Singleton();
        Singleton replica = new Singleton();

        Singleton instanciaA = creador.getInstanciaSingleton();
        Singleton instanciaB = creador.getInstanciaSingleton();
        Singleton instanciaC = replica.getInstanciaSingleton();

        System.out.println(">> instanciaA :: hashCode [" + instanciaA.hashCode() + "] " + instanciaA.getRandonNumber());
        System.out.println(">> instanciaB :: hashCode [" + instanciaB.hashCode() + "] " + instanciaB.getRandonNumber());
        System.out.println(">> instanciaC :: hashCode [" + instanciaC.hashCode() + "] " + instanciaC.getRandonNumber());
    }
}