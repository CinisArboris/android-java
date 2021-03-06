package com.example.singleton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Nav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        Singleton creador = Singleton.getInstanciaSingleton();

        Singleton instanciaA = creador.getInstanciaSingleton();
        Singleton instanciaB = creador.getInstanciaSingleton();

        System.out.println(">> instanciaA :: hashCode [" + instanciaA.hashCode() + "] " + instanciaA.getRandonNumber());
        System.out.println(">> instanciaB :: hashCode [" + instanciaB.hashCode() + "] " + instanciaB.getRandonNumber());

        /**
         * Resultado en consola de [logCat]
         * 02-21 11:13:35.639 4322-4322/com.example.singleton I/System.out: >> instanciaA :: hashCode [174882699] 17
         * 02-21 11:13:35.639 4322-4322/com.example.singleton I/System.out: >> instanciaB :: hashCode [174882699] 17
         */
    }
}