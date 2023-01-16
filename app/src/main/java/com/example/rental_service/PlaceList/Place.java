package com.example.rental_service.PlaceList;

public class Place {
    String name;
    String region;
    String comment;
    String itemTitle;
    int profileImg;
    int itemImg;

    public Place(String name, String region, String comment, String title, int img, int img2) {
        this.name = name;
        this.region = region;
        this.comment = comment;
        this.itemTitle = title;
        this.profileImg = img;
        this.itemImg = img2;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public int getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(int profileImg) {
        this.profileImg = profileImg;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }

    public String getRegion(){
        return region;
    }
    public void setRegion(){
        this.region=region;
    }

    public String getComment(){
        return comment;
    }
    public void setComment(){
        this.comment=comment;
    }


}
