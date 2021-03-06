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
/* C L I E N T E */

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