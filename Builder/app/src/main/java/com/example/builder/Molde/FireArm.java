package com.example.builder.Molde;
import com.example.builder.Componentes.*;
/* B U I L D E R -- I N T E R F A Z*/

public interface FireArm {
    void setAccesorio(Accesorio accesorio);
    void setCalibre(Calibre calibre);
    void setCargador(Cargador cargador);
    void setColor(Color color);
    void setCulata(Culata culata);
    void setDimensiones(Dimensiones dimensiones);
    void setNombre(Nombre nombre);
    void setPeso(Peso peso);
}
