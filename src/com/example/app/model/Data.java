package com.example.app.model;

public class Data {

    private String city;
    private double magnitude;

    public Data(String city, double magnitude) {
        this.city = city;
        this.magnitude = magnitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }
}
