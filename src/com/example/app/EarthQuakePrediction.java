package com.example.app;

import com.example.app.model.Data;

import java.util.HashMap;

public class EarthQuakePrediction implements Prediction{
    private static HashMap<String,Double> previousData = new HashMap<>();
    static{
        previousData.put("Hyderabad",7.2);
        previousData.put("Delhi",7.0);
    }

    private Data data;

    public EarthQuakePrediction(Data data) {
        this.data = data;
    }

    @Override
    public String predictDamage() {
        if(previousData.containsKey(data.getCity()) && data.getMagnitude() >= previousData.get(data.getCity())){
            return "very danger";
        }
        else if(data.getMagnitude() >= 8.0)
            return "very very danger";
        else if (data.getMagnitude() >= 7.0) {
            return "very danger";
        } else if (data.getMagnitude() >= 6.0) {
            return "danger";
        }
        return "fine";
    }
}
