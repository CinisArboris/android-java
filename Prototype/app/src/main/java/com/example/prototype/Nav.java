package com.example.prototype;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Nav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        ArrayList<Container> containerA = new ArrayList<>();
        ArrayList<Container> containerB = new ArrayList<>();

        Punto puntoA = new Punto();
        puntoA.setX(88);
        containerA.add(puntoA);

        Linea lineaA = new Linea();
        lineaA.setX(22);
        lineaA.setY(33);
        containerA.add(lineaA);

        Punto puntoB = (Punto) puntoA.clone();
        Linea lineaB = (Linea) lineaA.clone();

        clonar(containerA, containerB);
        igual(containerA, containerB);
    }

    private void igual(ArrayList<Container> containerA, ArrayList<Container> containerB) {
        for(int i=0; i<containerA.size(); i++){
            Container a = containerA.get(i);
            Container b = containerB.get(i);
            if (a != b){
                System.out.println(">> ok :: Ojetos diferentes.");
                Container aa = containerA.get(i);
                Container bb = containerB.get(i);
                if (aa.iguales(bb)){
                    System.out.println(">> ok :: Elementos iguales");
                }else{
                    System.out.println(">> 404");
                }
            }else{
                System.out.println(">> 404");
            }
        }
    }

    private void clonar(ArrayList<Container> containerOrigen, ArrayList<Container> containerDestino) {
        for(Container item : containerOrigen){
            containerDestino.add(item.clone());
        }
    }


}