package com.example.rental_service.Data_objects;

import com.google.gson.annotations.SerializedName;

public class Item {
    @SerializedName("my_index")             private int my_index;
    @SerializedName("owners_index")         private String owners_user_index;
    @SerializedName("uploaded_date_time")   private String uploaded_date_time;
    @SerializedName("title")                private String title;
    @SerializedName("content")              private String content;
    @SerializedName("appended_image_count") private int appended_image_count;
    @SerializedName("is_deleted")            private boolean deleted;
    @SerializedName("reservation_table_name")private String reservation_table_name;
    @SerializedName("comments_table_name")  private String comments_table_name;
    @SerializedName("review_table_name")    private String review_table_name;
    @SerializedName("encoded_images")       private String[] encodedImages;

    public int getAppended_image_count() {
        return appended_image_count;
    }

    public void setAppended_image_count(int appended_image_count) {
        this.appended_image_count = appended_image_count;
    }



    public String[] getEncodedImages() {
        return encodedImages;
    }

    public void setEncodedImages(String[] encodedImages) {
        this.encodedImages = encodedImages;
    }

    public int getMy_index() {
        return my_index;
    }

    public void setMy_index(int my_index) {
        this.my_index = my_index;
    }

    public String getOwners_user_index() {
        return owners_user_index;
    }

    public void setOwners_user_index(String owners_user_index) {
        this.owners_user_index = owners_user_index;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUploaded_date_time() {
        return uploaded_date_time;
    }

    public void setUploaded_date_time(String uploaded_date_time) {
        this.uploaded_date_time = uploaded_date_time;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getReservation_table_name() {
        return reservation_table_name;
    }

    public void setReservation_table_name(String reservation_table_name) {
        this.reservation_table_name = reservation_table_name;
    }

    public String getComments_table_name() {
        return comments_table_name;
    }

    public void setComments_table_name(String comments_table_name) {
        this.comments_table_name = comments_table_name;
    }

    public String getReview_table_name() {
        return review_table_name;
    }

    public void setReview_table_name(String review_table_name) {
        this.review_table_name = review_table_name;
    }
}
