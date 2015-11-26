package com.example.hasitha.bookmylot;

/**
 * Created by hasitha on 21/11/15.
 */
public class Mapmark {
    private String name;
    private String image;
    private Double latitude,longitude;


    public Mapmark(String name,String image,double latitude, double longitude)
    {
        this.setName(name);
        this.setImage(image);
        this.setLatitude(latitude);
        this.setLongitude(longitude);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


}
