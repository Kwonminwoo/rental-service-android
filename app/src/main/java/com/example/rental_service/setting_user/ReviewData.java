package com.example.rental_service.setting_user;

public class ReviewData {
    protected int index_of_review_DB;
    protected String date;
    protected String rate;
    protected String comment;

    public ReviewData(int index_of_review_DB, String comment, String rate, String date ) {
        this.index_of_review_DB = index_of_review_DB;
        this.date = date;
        this.rate = rate;
        this.comment = comment;
    }

    public int getIndex_of_review_DB() {
        return index_of_review_DB;
    }

    public void setIndex_of_review_DB(int index_of_review_DB) {
        this.index_of_review_DB = index_of_review_DB;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
