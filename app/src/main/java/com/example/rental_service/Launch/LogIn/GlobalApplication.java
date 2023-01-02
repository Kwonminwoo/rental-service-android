package com.example.rental_service.Launch.LogIn;

import android.app.Application;

import com.example.rental_service.BuildConfig;
import com.example.rental_service.R;
import com.kakao.sdk.common.KakaoSdk;

import java.util.Properties;

public class GlobalApplication extends Application {
    private static GlobalApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;


       // KakaoSdk.init(this, getResources().getString(R.string.kakao_api_key_for_java));
        KakaoSdk.init(this, BuildConfig.kakao_api);
    }
}
