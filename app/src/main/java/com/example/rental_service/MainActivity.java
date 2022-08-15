package com.example.rental_service;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;


import com.example.rental_service.setting_user.Fragment_Setting_User_Info;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import com.example.rental_service.HomeFragment.Fragment_Home;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import nl.joery.animatedbottombar.AnimatedBottomBar;

public class MainActivity extends AppCompatActivity {
    private AnimatedBottomBar bottomNav;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getHashKey();

        bottomNav= findViewById(R.id.bottom_Navi);

        getSupportFragmentManager().beginTransaction().add(R.id.container, new Fragment_Home()).commit(); //FrameLayout에 fragment.xml 띄우기

        bottomNav.setOnTabSelectListener(new AnimatedBottomBar.OnTabSelectListener() {
            @Override
            public void onTabSelected(int i, @Nullable AnimatedBottomBar.Tab tab, int i1, @NonNull AnimatedBottomBar.Tab tab1) {
                switch (tab1.getId()) {
                    case R.id.item_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Fragment_Home()).commit();
                        break;
                    case R.id.item_upload:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Fragment_Upload()).commit();
                        break;
                    case R.id.item_chatting:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Fragment_Chatting()).commit();
                        break;
                    case R.id.item_setting:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Fragment_Setting_User_Info()).commit();
                        break;
                }
            }

            @Override
            public void onTabReselected(int i, @NonNull AnimatedBottomBar.Tab tab) {

            }
        });
    }

    //카카오 맵 api 해시키 얻기
    private void getHashKey(){
        PackageInfo packageInfo = null;
        try {
            packageInfo = getPackageManager().getPackageInfo(getPackageName(), PackageManager.GET_SIGNATURES);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        if (packageInfo == null)
            Log.e("KeyHash", "KeyHash:null");

        for (Signature signature : packageInfo.signatures) {
            try {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("KeyHash", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            } catch (NoSuchAlgorithmException e) {
                Log.e("KeyHash", "Unable to get MessageDigest. signature=" + signature, e);
            }
        }
    }
}