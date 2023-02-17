package com.example.lifelinemy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class HomeFragment extends Fragment {

    ImageButton imageButton;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;
    ImageButton imageButton6;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        imageButton = view.findViewById(R.id.imageButton);
        imageButton2 = view.findViewById(R.id.imageButton2);
        imageButton3 = view.findViewById(R.id.imageButton3);
        imageButton4 = view.findViewById(R.id.imageButton4);
        imageButton5 = view.findViewById(R.id.imageButton5);
        imageButton6 = view.findViewById(R.id.imageButton6);

        imageButton.setOnClickListener(view1 -> {
            if (view1.getId() == R.id.imageButton){
                getParentFragmentManager().beginTransaction().replace(R.id.container, new tmFragment()).addToBackStack( "tag" ).commit();
            }
        });
        imageButton2.setOnClickListener(view1 -> {
            if (view1.getId() == R.id.imageButton2){
                getParentFragmentManager().beginTransaction().replace(R.id.container, new pdrmFragment()).addToBackStack( "tag" ).commit();
            }
        });
        imageButton4.setOnClickListener(view1 -> {
            if (view1.getId() == R.id.imageButton4){
                getParentFragmentManager().beginTransaction().replace(R.id.container, new helplineFragment()).addToBackStack( "tag" ).commit();
            }
        });
        imageButton5.setOnClickListener(view1 -> {
            if (view1.getId() == R.id.imageButton5){
                getParentFragmentManager().beginTransaction().replace(R.id.container, new aduanFragment()).addToBackStack( "tag" ).commit();
            }
        });

        imageButton3.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:15454"));
            startActivity(intent);
        });
        imageButton6.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:999"));
            startActivity(intent);
        });

        return view;
    }
}