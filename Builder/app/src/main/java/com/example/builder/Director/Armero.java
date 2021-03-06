package com.example.builder.Director;
import com.example.builder.Componentes.*;
import com.example.builder.Molde.FireArm;

public class Armero {

    public void contruirINTERVENTION(FireArm fireArm){
        fireArm.setNombre(Nombre.M200_INTERVENTION);
    }

    public void construirTACTICAL(FireArm fireArm){
        fireArm.setNombre(Nombre.M300_TACTICAL);
    }
}
