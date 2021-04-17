package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.recycleview.RecycleView.AdapterRecycleView;

import java.util.ArrayList;

public class Nav extends AppCompatActivity implements AdapterRecycleView.ItemClickListener {
    AdapterRecycleView adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        // data to populate the RecyclerView with
        ArrayList<String> animalNames = new ArrayList<>();
        for (int inicio = 0; inicio < 40; inicio++){
            animalNames.add("Nuevo Item" + inicio);
        }

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rv_items);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new AdapterRecycleView(this, animalNames);

        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
        System.out.println("queso" + adapter.listaElementos.toString());
    }
}