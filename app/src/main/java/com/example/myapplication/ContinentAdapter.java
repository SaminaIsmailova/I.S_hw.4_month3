package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentHolder> {
    private ArrayList<Continent> list;
    private OnClick onClick;

    public ContinentAdapter(ArrayList<Continent> list, OnClick onClick) {
        this.list = list;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ContinentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return  new ContinentHolder(ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentHolder holder, int position) {
        holder.bind(list.get(position));
        holder.itemView.setOnClickListener(view ->
                onClick.onClick(position)
        );
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
