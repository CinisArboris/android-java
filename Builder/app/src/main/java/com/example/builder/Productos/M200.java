package com.example.builder.Productos;
import com.example.builder.Componentes.*;
/* P R O D U C T O -- M200 */

public class M200 {
    private Accesorio accesorio;
    private Calibre calibre;
    private Cargador cargador;
    private Color color;
    private Culata culata;
    private Dimensiones dimensiones;
    private Nombre nombre;
    private Peso peso;

    public Accesorio getAccesorio() {
        return accesorio;
    }

    public Calibre getCalibre() {
        return calibre;
    }

    public Cargador getCargador() {
        return cargador;
    }

    public Color getColor() {
        return color;
    }

    public Culata getCulata() {
        return culata;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Peso getPeso() {
        return peso;
    }

    public M200(Accesorio accesorio, Calibre calibre, Cargador cargador, Color color, Culata culata, Dimensiones dimensiones, Nombre nombre, Peso peso) {
        this.accesorio = accesorio;
        this.calibre = calibre;
        this.cargador = cargador;
        this.color = color;
        this.culata = culata;
        this.dimensiones = dimensiones;
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return  "** M200{" +
                "\n** accesorio     =" + accesorio +
                "\n** calibre       =" + calibre.longitud +
                "\n** cargador      =" + cargador.cartuchos +
                "\n** color         =" + color.camuflaje +
                "\n** culata        =" + culata +
                "\n** dimensiones_an=" + dimensiones.ancho +
                "\n** dimensiones_la=" + dimensiones.largo +
                "\n** dimensiones_al=" + dimensiones.alto +
                "\n** nombre        =" + nombre.categoria +
                "\n** peso          =" + peso.masa +
                "\n** } (Unidades de medida :: Sistema Internacional)";
    }
}
