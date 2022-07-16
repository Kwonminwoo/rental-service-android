package com.example.rental_service.setting_user;

public class BsData {
    private int index_of_contract_on_DB;
    private String name_of_item;
    private String date_start;
    private String date_to_deadline;

    public BsData(int index_of_contract_on_DB, String name_of_item, String date_start, String date_to_deadline) {
        this.index_of_contract_on_DB = index_of_contract_on_DB;
        this.name_of_item = name_of_item;
        this.date_start = date_start;
        this.date_to_deadline = date_to_deadline;
    }

    public int getIndex_of_contract_on_DB() {
        return index_of_contract_on_DB;
    }

    public void setIndex_of_contract_on_DB(int index_of_contract_on_DB) {
        this.index_of_contract_on_DB = index_of_contract_on_DB;
    }

    public String getName_of_item() {
        return name_of_item;
    }

    public void setName_of_item(String name_of_item) {
        this.name_of_item = name_of_item;
    }

    public String getDate_start() {
        return date_start;
    }

    public void setDate_start(String date_start) {
        this.date_start = date_start;
    }

    public String getDate_to_deadline() {
        return date_to_deadline;
    }

    public void setDate_to_deadline(String date_to_deadline) {
        this.date_to_deadline = date_to_deadline;
    }
}
