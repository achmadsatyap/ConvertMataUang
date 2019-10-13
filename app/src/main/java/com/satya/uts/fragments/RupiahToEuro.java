package com.satya.uts.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.satya.uts.R;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 */
public class RupiahToEuro extends Fragment {


    public RupiahToEuro() {
        // Required empty public constructor
    }
    EditText input_uang;
    TextView hasilEuro;
    Button convertRupiah,clearRupiah;
    double rupiah, euro;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rupiah_to_euro, container, false);
        input_uang =  view.findViewById(R.id.text_rupiah_euro);
        convertRupiah = view.findViewById(R.id.button_convert_euro);
        clearRupiah = view.findViewById(R.id.button_clear_euro);
        hasilEuro = view.findViewById(R.id.euro);


        convertRupiah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rupiah = Double.valueOf(input_uang.getText().toString());
                euro = (rupiah / 15595);
                hasilEuro.setText(NumberFormat.getCurrencyInstance(Locale.GERMANY).format(euro));

            }
        });

        clearRupiah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_uang.setText(" ");
            }
        });

        return view;
    }

}
