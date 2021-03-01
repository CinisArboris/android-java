package com.example.builder.Molde;
import com.example.builder.Componentes.*;

public interface FireArm {
    /*BUILDER*/
    void setNombre(Nombre nombre);
    void setColor(Color color);
    void setPeso(Peso peso);
    void setCalibre(Calibre calibre);
    void setDimensiones(Dimensiones dimensiones);
    void setCargador(Cargador cargador);
    void setSupresor(Supresor supresor);
    void setRifle(Rifle rifle);
    void setCulata(Culata culata);
    void setAccesorio(Accesorio accesorio);
}
