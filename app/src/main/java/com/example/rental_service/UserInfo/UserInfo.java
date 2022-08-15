package com.example.rental_service.UserInfo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rental_service.R;

public class UserInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_info);

        RecyclerView recyclerView= findViewById(R.id.user_review_recyclerView);

        LinearLayoutManager layoutManager =
                new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        UserReviewAdapter adapter = new UserReviewAdapter();

        //확인용
        adapter.addItem(new UserReview("넘 조아요"));
        adapter.addItem(new UserReview("넘 조아요"));
        adapter.addItem(new UserReview("넘 조아요"));


        recyclerView.setAdapter(adapter);
    }
}
