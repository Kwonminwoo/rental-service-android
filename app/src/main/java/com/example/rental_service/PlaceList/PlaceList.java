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
        adapter.addItem(new Place("고양이","천안시 서북구", "파티룸 빌려드려요","파티룸", R.drawable.profile2, R.drawable.partiroom));
        adapter.addItem(new Place("사용자 B","천안 서북구", "넘 조아요", "멀티룸", R.drawable.profile1, R.drawable.multiroom));
        adapter.addItem(new Place("사용자 C","천안 서북구", "넘 조아요","ㅇㅇㅇ", R.drawable.profile3, R.drawable.tent));
        adapter.addItem(new Place("사용자 D","천안 서북구", "넘 조아요", "ㅁㄴㄻㄴㅇㄴㅁ", R.drawable.profile4, R.drawable.tent));

        recyclerView.setAdapter(adapter);
    }
}