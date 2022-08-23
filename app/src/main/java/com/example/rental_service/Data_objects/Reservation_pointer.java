package com.example.rental_service.Data_objects;

import com.google.gson.annotations.SerializedName;

public class Reservation_pointer {

    @SerializedName("my_index")private int my_index;
    @SerializedName("owners_id") private String owners_id;
    @SerializedName("brought_item_index")private int brought_item_index;
    @SerializedName("reservation_list_index") private int reservation_list_index;

    public int getMy_index() {
        return my_index;
    }

    public void setMy_index(int my_index) {
        this.my_index = my_index;
    }

    public String getOwners_id() {
        return owners_id;
    }

    public void setOwners_id(String owners_id) {
        this.owners_id = owners_id;
    }

    public int getBrought_item_index() {
        return brought_item_index;
    }

    public void setBrought_item_index(int brought_item_index) {
        this.brought_item_index = brought_item_index;
    }

    public int getReservation_list_index() {
        return reservation_list_index;
    }

    public void setReservation_list_index(int reservation_list_index) {
        this.reservation_list_index = reservation_list_index;
    }
}
