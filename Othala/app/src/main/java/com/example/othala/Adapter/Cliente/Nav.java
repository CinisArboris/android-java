package com.example.othala.Adapter.Cliente;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.othala.Adapter.Adapters.InglesToInternacional;
import com.example.othala.R;

import java.util.HashMap;
import java.util.Map;

public class Nav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        Map<String, Double> medida_A_Sist_Ing = new HashMap<String, Double>();
        Map<String, Double> medida_B_Sist_Ing = new HashMap<String, Double>();

        Map<String, Double> medida_A_Sist_Int = new HashMap<String, Double>();
        Map<String, Double> medida_B_Sist_Int = new HashMap<String, Double>();

        /*Medidas del fabricante*/
        medida_A_Sist_Ing.put("lb", 100.0);
        medida_B_Sist_Ing.put("in", 100.0);

        /*Sistema Ingles >> Sistema Internacional*/
        InglesToInternacional adap = new InglesToInternacional();
        medida_A_Sist_Int = adap.libraTOgramo(medida_A_Sist_Ing);
        medida_B_Sist_Int = adap.pulgadaTOcentimetro(medida_B_Sist_Ing);

        /*Mostrando resultados*/

        System.out.println("++++" + medida_A_Sist_Ing.toString());
        System.out.println("++++" + medida_A_Sist_Int.toString());
        System.out.println("++++" + medida_B_Sist_Ing.toString());
        System.out.println("++++" + medida_B_Sist_Int.toString());
    }
}