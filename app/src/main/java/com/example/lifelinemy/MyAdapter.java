package com.example.lifelinemy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private Context context;
    private ArrayList name,phoneno;

    public MyAdapter(Context context, ArrayList name, ArrayList phoneno) {
        this.context = context;
        this.name = name;
        this.phoneno = phoneno;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.userentry,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(String.valueOf(name.get(position)));
        holder.phoneno.setText(String.valueOf(phoneno.get(position)));

        //delete row
        holder.btnDelete.setOnClickListener(new View.OnClickListener() {

    }
    }


    @Override
    public int getItemCount() {
        return name.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name, phoneno, btnDelete;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.textname);
            phoneno = itemView.findViewById(R.id.textno);
            btnDelete = itemView.findViewById()
        }
    }
}
