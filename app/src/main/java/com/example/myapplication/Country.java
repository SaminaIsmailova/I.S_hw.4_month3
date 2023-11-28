package com.example.myapplication;

public class Country {

    private String countryImage;
    private String countryName;

    public String getCountryImage() {
        return countryImage;
    }

    public void setCountryImage(String countryImage) {
        this.countryImage = countryImage;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Country(String countryImage, String countryName) {
        this.countryImage = countryImage;
        this.countryName = countryName;
    }
}
