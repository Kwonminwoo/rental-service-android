package com.example.rental_service.Data_objects;

import com.google.gson.annotations.SerializedName;

public class User_DTO {
    @SerializedName("my_index")     private int my_index;
    @SerializedName("owners_id")    private String user_ID;
    @SerializedName("my_index")     private String name;
    @SerializedName("my_index")     private String nickname;
    @SerializedName("my_index")     private String Address;
    @SerializedName("my_index")     private String tel;
    @SerializedName("my_index")     private String phone_num;

    public int getMy_index() {
        return my_index;
    }

    public void setMy_index(int my_index) {
        this.my_index = my_index;
    }

    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }
}
