package com.example.lifelinemy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SettingsFragment extends Fragment {

    CardView location;
    CardView edit;
    CardView contact;
    CardView about;
    CardView rate;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        location = view.findViewById(R.id.location);
        edit = view.findViewById(R.id.edit);
        contact = view.findViewById(R.id.contact);
        about = view.findViewById(R.id.about);
        rate = view.findViewById(R.id.rate);

        location.setOnClickListener(view1 -> {
            if (view1.getId() == R.id.location){
                getParentFragmentManager().beginTransaction().replace(R.id.container,new locationFragment()).addToBackStack( "tag" ).commit();

            }
        });

        edit.setOnClickListener(view1 -> {
            if (view1.getId() == R.id.edit){
                getParentFragmentManager().beginTransaction().replace(R.id.container, new editFragment()).addToBackStack( "tag" ).commit();
            }
        });

        contact.setOnClickListener(view1 -> {
            if (view1.getId() == R.id.contact){
                        Intent intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("mailto: amirulaimanrohaimi@gmail.com"));
                        startActivity(intent);
            }
        });

        about.setOnClickListener(view1 -> {
            if (view1.getId() == R.id.about){
                getParentFragmentManager().beginTransaction().replace(R.id.container, new aboutFragment()).addToBackStack( "tag" ).commit();
            }
        });

        return view;
    }
}