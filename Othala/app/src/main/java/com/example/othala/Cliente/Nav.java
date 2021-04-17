package com.example.othala.Cliente;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.othala.Adapter.Adapters.InglesToInternacional;
import com.example.othala.Builder.Constructores.BuilderM200;
import com.example.othala.Builder.Constructores.BuilderM300;
import com.example.othala.Builder.Director.Armero;
import com.example.othala.Builder.Productos.M200;
import com.example.othala.Builder.Productos.M300;
import com.example.othala.R;

import java.util.HashMap;
import java.util.Map;

public class Nav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        /*DIRECTOR*/
        Armero armero = new Armero();

        /*C O N S T R U C C I O N*/
        BuilderM200 procesoM200 = new BuilderM200();
        armero.constructorM200(procesoM200);

        BuilderM300 procesoM300 = new BuilderM300();
        armero.constructorM300(procesoM300);

        /*E X T R A C C I O N*/
        M200 m200 = procesoM200.getProducto();
        M300 m300 = procesoM300.getProducto();

        /*R E S U L T A D O S*/
        System.out.println("********** ARMERIA FICCT **********");
        System.out.println("*****       La unión hace la fuerza");
        System.out.println("***********************************");
        System.out.println(m200.toString());
        System.out.println("***********************************");
        System.out.println(m300.toString());
        System.out.println("***********************************");
    }
}