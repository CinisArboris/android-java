package com.example.adapter.Cliente;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.adapter.Adapters.InglesToInternacional;
import com.example.adapter.R;

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
        medida_A_Sist_Int = adap.librasTOgramo(medida_A_Sist_Ing);
        medida_B_Sist_Int = adap.pulgadaTOcentimetro(medida_B_Sist_Ing);

        /*Mostrando resultados*/

        System.out.println("++++" + medida_A_Sist_Ing.toString());
        System.out.println("++++" + medida_A_Sist_Int.toString());
        System.out.println("++++" + medida_B_Sist_Ing.toString());
        System.out.println("++++" + medida_B_Sist_Int.toString());
    }




}