package com.example.builder.Cliente;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.builder.Componentes.Nombre;
import com.example.builder.Constructores.BuilderM200;
import com.example.builder.Constructores.BuilderM300;
import com.example.builder.Director.Armero;
import com.example.builder.Molde.FireArm;
import com.example.builder.Productos.*;
import com.example.builder.R;

public class Nav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        Armero armero = new Armero();

        /*C O N S T R U C C I O N*/
        BuilderM200 builderM200 = new BuilderM200();
        armero.construirTACTICAL(builderM200);

        BuilderM300 builderM300 = new BuilderM300();
        armero.contruirINTERVENTION(builderM300);

        /*C O M P O N E N T E S*/
        builderM200.setNombre(Nombre.M200_INTERVENTION);

        /*C O M P O N E N T E S*/
        builderM300.setNombre(Nombre.M300_TACTICAL);

        /*E X T R A C C I O N*/
        M200 m200 = builderM200.getProducto();
        M300 m300 = builderM300.getProducto();

        /*R E S U L T A D O S*/
        System.out.println("M200\n" + m200.toString());
        System.out.println("************************");
        System.out.println("M300\n" + m300.toString());
    }
}