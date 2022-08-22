package com.example.rental_service.PlaceList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.rental_service.R;

public class PlaceList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        RecyclerView recyclerView= findViewById(R.id.place_recyclerView);

        LinearLayoutManager layoutManager =
                new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        PlaceAdapter adapter = new PlaceAdapter();

        //확인용
        adapter.addItem(new Place("사용자 A","천안 서북구", "넘 조아요"));
        adapter.addItem(new Place("사용자 A","천안 서북구", "넘 조아요"));
        adapter.addItem(new Place("사용자 A","천안 서북구", "넘 조아요"));
        adapter.addItem(new Place("사용자 A","천안 서북구", "넘 조아요"));

        recyclerView.setAdapter(adapter);
    }
}