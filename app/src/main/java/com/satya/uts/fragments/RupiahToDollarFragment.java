

package com.satya.uts.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.satya.uts.R;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 */
public class RupiahToDollarFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    public RupiahToDollarFragment() {
        // Required empty public constructor
    }
    EditText input_uang;
    TextView hasilDollar;
    Button convertRupiah,clearRupiah;
    double rupiah, dollar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rupiah_to_dollar, container, false);
        input_uang =  view.findViewById(R.id.text_rupiah);
        convertRupiah = view.findViewById(R.id.button_convert);
        clearRupiah = view.findViewById(R.id.button_clear);
        hasilDollar = view.findViewById(R.id.dollar);


        convertRupiah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rupiah = Double.valueOf(input_uang.getText().toString());
                dollar = (rupiah / 14133);
                hasilDollar.setText(NumberFormat.getCurrencyInstance(Locale.US).format(dollar));


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

    private class OnFragmentInteractionListener {
    }
}
