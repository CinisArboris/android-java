package com.example.othala.Cliente;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.example.othala.Adapter.Adapters.InglesToInternacional;
import com.example.othala.Builder.Constructores.BuilderM200;
import com.example.othala.Builder.Constructores.BuilderM300;
import com.example.othala.Builder.Director.Armero;
import com.example.othala.Builder.Productos.M200;
import com.example.othala.Builder.Productos.M300;
import com.example.othala.R;

import java.util.HashMap;
import java.util.Map;

public class Nav extends FragmentActivity {
    Switch switchm200;
    Switch switchm300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);
        switchm200 = findViewById(R.id.switch1);
        switchm300 = findViewById(R.id.switch2);

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

    public void fabricar(View view){
        Toast.makeText(this, "hallo", Toast.LENGTH_SHORT).show();
    }

    public void configurarm200(View view){
        final String[] m_Text = {"a"};
        if (switchm200.isChecked()){
            Toast.makeText(this, "m200", Toast.LENGTH_SHORT).show();

            /*
            AlertDialog.Builder builder = new AlertDialog.Builder(this.getBaseContext());
            builder.setTitle("Title");
            View viewInflated = LayoutInflater.from(this.getBaseContext()).inflate(R.layout.fragment_edit_text_conf, (ViewGroup) getBaseContext(), false);
            final EditText input = (EditText) viewInflated.findViewById(R.id.editTextConf);
            builder.setView(viewInflated);
            builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    m_Text[0] = input.getText().toString();
                }
            });
            builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            builder.show();
             */
        }
    }
    public void configurarm300(View view){
        if (switchm300.isChecked()){
            Toast.makeText(this, "m300", Toast.LENGTH_SHORT).show();
        }
    }
}