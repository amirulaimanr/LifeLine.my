package com.example.lifelinemy;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class editFragment extends Fragment {

    CardView cv1;
    CardView cv2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_edit, container, false);

        cv1 = view.findViewById(R.id.registerNum);
        cv2 = view.findViewById(R.id.numRegistered);

        cv1.setOnClickListener(view1 -> {
            if (view1.getId() == R.id.registerNum){
                getParentFragmentManager().beginTransaction().replace(R.id.container,new RegisterFragment()).addToBackStack( "tag" ).commit();

            }
        });

        cv2.setOnClickListener(view1 -> {
            if (view1.getId() == R.id.numRegistered){
                getParentFragmentManager().beginTransaction().replace(R.id.container,new ViewFragment()).addToBackStack( "tag" ).commit();

            }
        });

        return view;
    }
}