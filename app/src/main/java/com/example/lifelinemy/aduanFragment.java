package com.example.lifelinemy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class aduanFragment extends Fragment {

    ImageView aa1;
    ImageView aa2;
    ImageView aa3;
    ImageView aa4;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_aduan, container, false);

        aa1 = view.findViewById(R.id.biro);
        aa2 = view.findViewById(R.id.pengguna);
        aa3 = view.findViewById(R.id.fomca);
        aa4 = view.findViewById(R.id.mca);


        aa1.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:03 8888 7777"));
            startActivity(intent);
        });

        aa2.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:+6019-359 1000"));
            startActivity(intent);
        });
        aa3.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:03 7876 2009"));
            startActivity(intent);
        });
        aa4.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:03 6258 9323"));
            startActivity(intent);
        });


        return view;
    }
}