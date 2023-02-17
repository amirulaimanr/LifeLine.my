package com.example.lifelinemy;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class RegisterFragment extends Fragment {

    TextInputEditText name;
    TextInputEditText phoneno;
    CardView save;
    DBHelper DB;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_register, container, false);

        name = view.findViewById(R.id.PersonName);
        phoneno = view.findViewById(R.id.PhoneNo);

        save = view.findViewById(R.id.btnSave);
        DB = new DBHelper(getActivity());

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();
                String phonenoTXT = phoneno.getText().toString();
                
                Boolean checkinsertdata = DB.insertuserdata(nameTXT, phonenoTXT);
                if (checkinsertdata==true && !nameTXT.isEmpty() && !phonenoTXT.isEmpty())
                    Toast.makeText(getActivity(), "New Entry Saved", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getActivity(), "New Entry Not Saved", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}