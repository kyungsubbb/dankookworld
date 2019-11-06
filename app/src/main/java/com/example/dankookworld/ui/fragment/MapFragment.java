package com.example.dankookworld.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.dankookworld.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_map, container, false);
        getFragmentManager().beginTransaction().add(R.id.mapFrame, new MapFragment_wait()).commit();
        ImageButton wtB = view.findViewById(R.id.wtB);
        ImageButton atB = view.findViewById(R.id.atB);
        ImageButton foB = view.findViewById(R.id.foB);
        ImageButton stB = view.findViewById(R.id.stB);
        wtB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().add(R.id.mapFrame, new MapFragment_wait()).commit();
            }
        });
        atB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().add(R.id.mapFrame, new MapFragment_attraction()).commit();
            }
        });
        foB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().add(R.id.mapFrame, new MapFragment_food()).commit();
            }
        });
        stB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().add(R.id.mapFrame, new MapFragment_store()).commit();
            }
        });


        return view;
    }


}

