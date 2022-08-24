package com.example.rental_service._Network_retrofit2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URL;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
//warning: no need to be edited more.
public class RetrofitClient {

    private static final String BASE_URL = URL_holder.getURL();
    public static Retrofit getInstance(){
        Gson gson = new GsonBuilder().setLenient().create();
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }
}
