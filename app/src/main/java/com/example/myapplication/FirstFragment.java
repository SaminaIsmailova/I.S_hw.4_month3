package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentFirstBinding;

import java.util.ArrayList;


public class FirstFragment extends Fragment implements OnClick {
    private FragmentFirstBinding binding;
    private ArrayList<Continent> listContinent;
    private ContinentAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new ContinentAdapter(listContinent, this::onClick);
        binding.rvContinent.setAdapter(adapter);
    }

    @Override
    public void onClick(int position) {
        SecondFragment secondFragment = new SecondFragment();
        Bundle bundle = new Bundle();

        bundle.putInt("key", position);
        secondFragment.setArguments(bundle);
        requireActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, secondFragment)
                .addToBackStack(null)
                .commit();
    }

    private void loadData() {
        listContinent = new ArrayList<>();
        listContinent.add(new Continent("Евразия"));
        listContinent.add(new Continent("Африка"));
        listContinent.add(new Continent(" Северная Америка"));
        listContinent.add(new Continent("Южная Америка"));
        listContinent.add(new Continent("Австралия"));
    }
}