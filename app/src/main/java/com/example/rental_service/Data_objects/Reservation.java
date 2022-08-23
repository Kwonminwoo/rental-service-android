package com.example.rental_service.Data_objects;


import com.google.gson.annotations.SerializedName;

public class Reservation {
    @SerializedName("my_index") private int my_index;
    @SerializedName("customer_user_index")private String customer_user_index;
    @SerializedName("start_date_time")private String start_date_time;
    @SerializedName("end_date_time") private String end_date_time;
    @SerializedName("where_to_brought") private String where_to_brought;
    @SerializedName("where_to_be_return")  private String where_to_be_return;
    @SerializedName("Where_is_item_now") private String Where_is_item_now;
    @SerializedName("is_movable")private boolean is_movable;
    @SerializedName("is_returned") private boolean is_returned;

    public int getMy_index() {
        return my_index;
    }

    public void setMy_index(int my_index) {
        this.my_index = my_index;
    }

    public String getCustomer_user_index() {
        return customer_user_index;
    }

    public void setCustomer_user_index(String customer_user_index) {
        this.customer_user_index = customer_user_index;
    }

    public String getStart_date_time() {
        return start_date_time;
    }

    public void setStart_date_time(String start_date_time) {
        this.start_date_time = start_date_time;
    }

    public String getEnd_date_time() {
        return end_date_time;
    }

    public void setEnd_date_time(String end_date_time) {
        this.end_date_time = end_date_time;
    }

    public String getWhere_to_brought() {
        return where_to_brought;
    }

    public void setWhere_to_brought(String where_to_brought) {
        this.where_to_brought = where_to_brought;
    }

    public String getWhere_to_be_return() {
        return where_to_be_return;
    }

    public void setWhere_to_be_return(String where_to_be_return) {
        this.where_to_be_return = where_to_be_return;
    }

    public String getWhere_is_item_now() {
        return Where_is_item_now;
    }

    public void setWhere_is_item_now(String where_is_item_now) {
        Where_is_item_now = where_is_item_now;
    }

    public boolean isIs_movable() {
        return is_movable;
    }

    public void setIs_movable(boolean is_movable) {
        this.is_movable = is_movable;
    }

    public boolean isIs_returned() {
        return is_returned;
    }

    public void setIs_returned(boolean is_returned) {
        this.is_returned = is_returned;
    }
}
