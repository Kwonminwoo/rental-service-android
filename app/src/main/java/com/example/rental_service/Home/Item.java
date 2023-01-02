package com.example.rental_service.Home;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;

import java.sql.Blob;

public class Item {
    private int mainImage;
    private String name;
    private String userName;
    private String date;
    private String title;

    @NonNull
    @Override
    public String toString() {
        String str = name + " " + date + " " + title;
        return str;
    }

    public Item() {
    }

    public int getMainImage() {
        return mainImage;
    }

    public void setMainImage(int mainImage) {
        this.mainImage = mainImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
