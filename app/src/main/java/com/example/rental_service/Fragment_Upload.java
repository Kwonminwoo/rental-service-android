package com.example.rental_service;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rental_service.Home.ItemAdapter;

public class Fragment_Upload extends Fragment {

    Button reqBtn, registBtn;
    RecyclerView recyclerView;
    public Fragment_Upload() {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @NonNull Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_upload, container, false);
        reqBtn = view.findViewById(R.id.request_btn);
        registBtn = view.findViewById(R.id.registr_btn);

        reqBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), RequestUploadActivity.class);
                startActivity(intent);
            }
        });
        recyclerView = view.findViewById(R.id.myItemRecycler);
        setMyItemData();
        return view;
    }

    private void setMyItemData(){
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        MyItemAdapter itemAdapter = new MyItemAdapter();
        recyclerView.setAdapter(itemAdapter);
        itemAdapter.addItem(new MyItem(R.drawable.auditourium, "이러이러한 물건입니다."));
        itemAdapter.addItem(new MyItem(R.drawable.auditourium, "이러이러한 물건입니다."));
        itemAdapter.addItem(new MyItem(R.drawable.auditourium, "이건 어때?"));
        itemAdapter.addItem(new MyItem(R.drawable.pot, "냄비 빌려요"));
        itemAdapter.addItem(new MyItem(R.drawable.pot, "냄비 빌려요"));
        itemAdapter.addItem(new MyItem(R.drawable.pot, "냄비 빌려요"));
        itemAdapter.addItem(new MyItem(R.drawable.pot, "냄비 빌려요"));
        itemAdapter.addItem(new MyItem(R.drawable.pot, "냄비 빌려요"));
    }

}