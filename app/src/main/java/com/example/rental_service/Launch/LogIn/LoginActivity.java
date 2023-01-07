package com.example.rental_service.Launch.LogIn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.example.rental_service.MainActivity;
import com.example.rental_service.R;
import com.kakao.sdk.user.UserApiClient;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "Fail";

    ImageButton kakaoLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        kakaoLogin = (ImageButton) findViewById(R.id.kakao_login_button);
        kakaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();

//                // 로그인 공통 callback 구성
//                UserApiClient.getInstance().loginWithKakaoTalk(LoginActivity.this,(oAuthToken, error) -> {
//                    if (error != null) {
//                        Log.e(TAG, "로그인 실패", error);
//                    } else if (oAuthToken != null) {
//                        Log.i(TAG, "로그인 성공(토큰) : " + oAuthToken.getAccessToken());
//                    }
//                    return null;
//                });


            }
        });

        /* 로그아웃
        UserApiClient.getInstance().logout(error -> {
            if (error != null) {
                Log.e(TAG, "로그아웃 실패, SDK에서 토큰 삭제됨", error);
            }else{
                Log.e(TAG, "로그아웃 성공, SDK에서 토큰 삭제됨");
            }
        });

         */

//        UserApiClient.getInstance().me((user, meError) -> {
//            if (meError != null) {
//                Log.e(TAG, "사용자 정보 요청 실패", meError);
//            } else {
//                Log.i(TAG, "사용자 정보 요청 성공" +
//                        "\n회원번호: "+user.getId() +
//                        "\n이메일: "+user.getKakaoAccount().getEmail());
//            }
//            return null;
//        });

//        startActivity(new Intent(getApplicationContext(), MainActivity.class));
//        finish();
    }
}