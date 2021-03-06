package com.example.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Key extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    /*var*/private EditText keyEdit;
    /*var*/private Button keyButton;
    /*var*/private Byfrost keyByfrost;

    public Key() {
        // Required empty public constructor
    }

    public static Key newInstance(String param1, String param2) {
        Key fragment = new Key();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_key, container, false);

        this.keyButton = view.findViewById(R.id.key_button);
        this.keyEdit = view.findViewById(R.id.key_edit);

        this.keyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                keyByfrost.interface_portal(keyEdit.getText().toString());
            }
        });

        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        keyByfrost = (Byfrost) context;
    }
}