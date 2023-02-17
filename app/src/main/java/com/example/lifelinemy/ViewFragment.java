package com.example.lifelinemy;

import android.database.Cursor;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ViewFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<String> name, phoneno;
    DBHelper DB;
    MyAdapter adapter;
    TextView delete;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_view, container, false);

        DB = new DBHelper(getActivity());
        name = new ArrayList<>();
        phoneno = new ArrayList<>();
        delete = view.findViewById(R.id.btnDelete);
        recyclerView = view.findViewById(R.id.recyclerview);
        adapter = new MyAdapter(getActivity(),name, phoneno);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        displaydata();

//        delete.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String nameTXT = name.ge.toString();
//
//                Boolean checkdeletedata  = DB.deleteuserdata(nameTXT);
//                if(checkdeletedata==true)
//                {
//                    Toast.makeText(MainActivity.this, "Entry Deleted", Toast.LENGTH_SHORT).show();
//                }
//                else
//                {
//                    Toast.makeText(MainActivity.this, "Entry Not Deleted", Toast.LENGTH_SHORT).show();
//                }
//
//            }
//        });
//
//        return view;
//    }

    private void displaydata() {

        Cursor cursor = DB.getdata();
        if(cursor.getCount()==0){
            Toast.makeText(getActivity(), "No Entry Exists", Toast.LENGTH_SHORT).show();
            return;
        } else {
            while(cursor.moveToNext()){
                name.add(cursor.getString(0));
                phoneno.add(cursor.getString(1));
            }
        }

    }
}