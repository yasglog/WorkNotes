package com.example.keepnotes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter <myAdapter.holder>{
  ArrayList<Note>allnote;

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.itemnote,parent,false);
        return new holder((view));
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class holder extends RecyclerView.ViewHolder{
        TextView t1;
        TextView t2;
        TextView t3;
        public holder(@NonNull View itemView) {
            super(itemView);
            t1=(TextView) itemView .findViewById(R.id.text_priority);
            t2=(TextView) itemView.findViewById(R.id.text_description);
            t3=(TextView) itemView.findViewById(R.id.text_view);

        }
    }
}
