package com.example.builder.Director;
import com.example.builder.Componentes.*;
import com.example.builder.Molde.FireArm;
/* D I R E C T O R -- J E F E */

public class Armero {

    public void constructorM200(FireArm fireArm){
        fireArm.setAccesorio(Accesorio.TRIPODE);
        fireArm.setCalibre(Calibre.M200_B);
        fireArm.setCargador(Cargador.SEIS);
        fireArm.setColor(Color.BLACK);
        fireArm.setCulata(Culata.RETRACTIL);
        fireArm.setDimensiones(Dimensiones.M200);
        fireArm.setNombre(Nombre.M200);
        fireArm.setPeso(Peso.M200);
    }

    public void constructorM300(FireArm fireArm){
        fireArm.setAccesorio(Accesorio.TRIPODE);
        fireArm.setCalibre(Calibre.M300_A);
        fireArm.setCargador(Cargador.CINCO);
        fireArm.setColor(Color.BLACK);
        fireArm.setCulata(Culata.RETRACTIL);
        fireArm.setDimensiones(Dimensiones.M300);
        fireArm.setNombre(Nombre.M300);
        fireArm.setPeso(Peso.M300);
    }
}
