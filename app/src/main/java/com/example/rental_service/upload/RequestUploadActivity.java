package com.example.rental_service.upload;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rental_service.R;

public class RequestUploadActivity extends AppCompatActivity {
    Button cancelBtn, reqBtn, objectBtn, placeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_request);
        cancelBtn = findViewById(R.id.cancel_btn2);
        reqBtn = findViewById(R.id.request_btn2);

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        reqBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}