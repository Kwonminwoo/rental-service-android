package com.example.rental_service.PlaceList;

public class Place {
    String name;
    String region;
    String comment;


    public Place(String name, String region, String comment) {
        this.name = name;
        this.region = region;
        this.comment = comment;
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
