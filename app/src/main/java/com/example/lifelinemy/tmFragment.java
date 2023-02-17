package com.example.lifelinemy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class tmFragment extends Fragment {

    ImageView tm1;
    ImageView tm2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tm, container, false);

        tm1 = view.findViewById(R.id.local);
        tm2 = view.findViewById(R.id.international);

        tm1.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:100"));
            startActivity(intent);
        });

        tm2.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:+603 2241 1290"));
            startActivity(intent);
        });

        return view;
    }
}