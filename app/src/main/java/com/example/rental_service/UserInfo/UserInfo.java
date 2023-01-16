package com.example.rental_service.UserInfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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
        View chatBtn = findViewById(R.id.chatBtn);
        chatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(UserInfo.this, "채팅하기", Toast.LENGTH_SHORT).show();
            }
        });

        LinearLayoutManager layoutManager =
                new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        UserReviewAdapter adapter = new UserReviewAdapter();

        //확인용
        adapter.addItem(new UserReview("너무 친절하세요"));
        adapter.addItem(new UserReview("넘 조아요"));
        adapter.addItem(new UserReview("물건 잘 사용했어요. 굿~"));


        recyclerView.setAdapter(adapter);
    }
}
