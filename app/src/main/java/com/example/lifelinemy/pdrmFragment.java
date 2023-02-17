package com.example.lifelinemy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;


public class pdrmFragment extends Fragment {

    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;
    ImageView img10;
    ImageView img11;
    ImageView img12;
    ImageView img13;
    ImageView img14;
    ImageView img15;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pdrm, container, false);

        img1 = view.findViewById(R.id.kl);
        img2 = view.findViewById(R.id.selangor);
        img3 = view.findViewById(R.id.perlis);
        img4 = view.findViewById(R.id.kedah);
        img5 = view.findViewById(R.id.perak);
        img6 = view.findViewById(R.id.pahang);
        img7 = view.findViewById(R.id.terengganu);
        img8 = view.findViewById(R.id.kelantan);
        img9 = view.findViewById(R.id.johor);
        img10 = view.findViewById(R.id.sabah);
        img11 = view.findViewById(R.id.sarawak);
        img12 = view.findViewById(R.id.labuan);
        img13 = view.findViewById(R.id.ns);
        img14 = view.findViewById(R.id.melaka);
        img15 = view.findViewById(R.id.penang);


        img1.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:03-2146 0585"));
            startActivity(intent);
        });

        img2.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:03-5514 5203"));
            startActivity(intent);
        });

        img3.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:04-908 2222"));
            startActivity(intent);
        });

        img4.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:04-739 2999"));
            startActivity(intent);
        });

        img5.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:05-240 1999"));
            startActivity(intent);
        });

        img6.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:09-515 1999"));
            startActivity(intent);
        });

        img7.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:09-627 0499"));
            startActivity(intent);
        });

        img8.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:09-745 0999"));
            startActivity(intent);
        });

        img9.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:07-221 2999"));
            startActivity(intent);
        });

        img10.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:088-318 555"));
            startActivity(intent);
        });

        img11.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:082-240 800"));
            startActivity(intent);
        });

        img12.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:087-412 575"));
            startActivity(intent);
        });

        img13.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:06-761 9999"));
            startActivity(intent);
        });

        img14.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:06-285 1999"));
            startActivity(intent);
        });

        img15.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:04-269 1999"));
            startActivity(intent);
        });

        return view;
    }
}