package com.example.rental_service;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private Fragment_Home fragment_home;
    private Fragment_Upload fragment_upload;
    private Fragment_Chatting fragment_chatting ;
    private Fragment_Setting_User_Info fragment_setting_user_info;
    BottomNavigationView bottomNav;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNav= findViewById(R.id.bottom_Navi);
        fragment_home = new Fragment_Home();
        fragment_upload = new Fragment_Upload();
        fragment_chatting = new Fragment_Chatting();
        fragment_setting_user_info = new Fragment_Setting_User_Info();
        
        
        replace_main_frame_to(fragment_home);


        bottomNav.setOnNavigationItemSelectedListener(menuItem -> {
            switch (menuItem.getItemId()) {
                //클릭된 아이템의 아이디 값을 가져와서 해당하는 case 실행
                case R.id.item_home:
                    replace_main_frame_to(fragment_home);
                    break;
                case R.id.item_upload:
                    replace_main_frame_to(fragment_upload);
                    break;
                case R.id.item_chatting:
                    replace_main_frame_to(fragment_chatting);
                    break;
                case R.id.item_setting:
                    replace_main_frame_to(fragment_setting_user_info);
                    break;

            }
            return true;
        });
    }

    public void replace_main_frame_to(Fragment fragment){
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame,fragment);
        transaction.addToBackStack(null);//기존 프래그먼트를 backstack에 추가해주는 함수, 기존 프래그먼트는 pause 상태가 됨
        transaction.commit();//새로고침 해라
    }
}