package com.example.app;

import com.example.app.model.Data;

// week 5 Earthquake prediction case study.

public class App {

    public static void main(String[] args) {
        Action action = new Action();
        Prediction prediction = new EarthQuakePrediction(new Data("Hyderabad",6.3));

        System.out.println("danger level -: " +prediction.predictDamage());
        action.action(prediction.predictDamage());

        Prediction prediction1 = new EarthQuakePrediction(new Data("Delhi",7.4));
        System.out.println("danger level -: " + prediction1.predictDamage());
        action.action(prediction1.predictDamage());
    }
}
