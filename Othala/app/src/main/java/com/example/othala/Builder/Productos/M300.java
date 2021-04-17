package com.example.othala.Builder.Productos;

import com.example.othala.Adapter.Adapters.InglesToInternacional;
import com.example.othala.Builder.Componentes.*;

import java.util.HashMap;
import java.util.Map;
/* P R O D U C T O -- M300 */

public class M300 {
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

    public M300(Accesorio accesorio, Calibre calibre, Cargador cargador, Color color, Culata culata, Dimensiones dimensiones, Nombre nombre, Peso peso) {
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
        /*Inicializar variables (toAdapt)*/
        Map<String, Double> medida_A_Sist_Ing = new HashMap<String, Double>();
        Map<String, Double> medida_B_Sist_Ing = new HashMap<String, Double>();
        Map<String, Double> medida_C_Sist_Ing = new HashMap<String, Double>();
        Map<String, Double> medida_D_Sist_Ing = new HashMap<String, Double>();
        Map<String, Double> medida_E_Sist_Ing = new HashMap<String, Double>();
        /*Inicializar variables (normales)*/
        Map<String, Double> medida_A_Sist_Int = new HashMap<String, Double>();
        Map<String, Double> medida_B_Sist_Int = new HashMap<String, Double>();
        Map<String, Double> medida_C_Sist_Int = new HashMap<String, Double>();
        Map<String, Double> medida_D_Sist_Int = new HashMap<String, Double>();
        Map<String, Double> medida_E_Sist_Int = new HashMap<String, Double>();

        /*Registro las medidas del fabricante*/
        medida_A_Sist_Ing.put("in", calibre.longitud);
        medida_B_Sist_Ing.put("in", dimensiones.ancho);
        medida_C_Sist_Ing.put("in", dimensiones.largo);
        medida_D_Sist_Ing.put("in", dimensiones.alto);
        medida_E_Sist_Ing.put("lb", peso.masa);

        /*Adapter*/
        InglesToInternacional adap = new InglesToInternacional();

        /*Sistema Ingles >> Sistema Internacional*/
        medida_A_Sist_Int = adap.pulgadaTOcentimetro(medida_A_Sist_Ing);
        medida_B_Sist_Int = adap.pulgadaTOcentimetro(medida_B_Sist_Ing);
        medida_C_Sist_Int = adap.pulgadaTOcentimetro(medida_C_Sist_Ing);
        medida_D_Sist_Int = adap.pulgadaTOcentimetro(medida_D_Sist_Ing);
        medida_E_Sist_Int = adap.libraTOgramo(medida_E_Sist_Ing);

        String resultado = "";
        String aux = "";

        resultado += "** M300{";
        resultado += "[accesorio="+accesorio+"]";
        aux = String.format("%.2f", medida_A_Sist_Int.get("cm"));
        resultado += "[calibre=" + aux+"]";
        resultado += "[cargador=" + cargador.cartuchos+"]";
        resultado += "[color=" + color.camuflaje+"]";
        resultado += "[culata=" + culata+"]";
        aux = String.format("%.2f", medida_B_Sist_Int.get("cm"));
        resultado +="[dimensiones_an=" + aux+"]";
        aux = String.format("%.2f", medida_C_Sist_Int.get("cm"));
        resultado +="[dimensiones_la=" + aux+"]";
        aux = String.format("%.2f", medida_D_Sist_Int.get("cm"));
        resultado +="[dimensiones_al=" + aux+"]";
        resultado +="[nombre=" + nombre.categoria+"]";
        aux = String.format("%.2f", medida_E_Sist_Int.get("g"));
        resultado +="[peso=" + aux+"]";
        resultado +="}";

        return resultado;
    }
}
