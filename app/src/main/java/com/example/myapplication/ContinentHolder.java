package com.example.myapplication;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.ItemContinentBinding;

public class ContinentHolder extends RecyclerView.ViewHolder{
    private ItemContinentBinding binding;

    public ContinentHolder(ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public void bind (Continent continent){
        binding.tvContinent.setText(continent.getContinentName());
    }

}
