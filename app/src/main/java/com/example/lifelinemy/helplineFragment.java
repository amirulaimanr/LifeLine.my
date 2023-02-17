package com.example.lifelinemy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class helplineFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ImageView h1;
        ImageView h2;
        ImageView h3;
        ImageView h4;
        ImageView h5;
        ImageView h6;


        View view = inflater.inflate(R.layout.fragment_helpline, container, false);

        h1 = view.findViewById(R.id.oscc);
        h2 = view.findViewById(R.id.befrienders);
        h3 = view.findViewById(R.id.boi);
        h4 = view.findViewById(R.id.hawa);
        h5 = view.findViewById(R.id.awam);
        h6 = view.findViewById(R.id.wao);

        h1.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:03 2615 3333"));
            startActivity(intent);
        });

        h2.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:03 7956 8144"));
            startActivity(intent);
        });

        h3.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:05 546 7633"));
            startActivity(intent);
        });

        h4.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:03 2693 0095"));
            startActivity(intent);
        });

        h5.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:03 7877 4221"));
            startActivity(intent);
        });

        h6.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:03 7956 3488"));
            startActivity(intent);
        });



        return view;
    }
}