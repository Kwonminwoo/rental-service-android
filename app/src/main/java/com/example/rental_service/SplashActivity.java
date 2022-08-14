package com.example.rental_service;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.rental_service.MainActivity;
import com.example.rental_service.R;

@SuppressWarnings("ALL")
public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        YoYo.with(Techniques.Landing).duration(700).playOn(findViewById(R.id.LogoContainer));
                    }
                });

                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 2000);
    }

}