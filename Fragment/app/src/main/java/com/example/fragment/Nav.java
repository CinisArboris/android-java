package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Nav extends AppCompatActivity implements Byfrost{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);
    }

    @Override
    public void interface_portal(String cadena) {
        Value valueContext = (Value) getSupportFragmentManager().findFragmentById(R.id.frag_value);
        valueContext.value_set_text(cadena);
    }
}