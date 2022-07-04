package com.example.app;

import com.example.app.constants.Constants;

import java.util.Scanner;

// Main class..

public class City {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(Constants.SUSCEPTIBLE);
        int noOfSusceptible = sc.nextInt();
        System.out.println(Constants.INFECTED);
        int noOfInfected = sc.nextInt();
        System.out.println(Constants.RECOVERED);
        int noOfRecovered = sc.nextInt();
        System.out.println(Constants.VACCINATED);
        int noOfVaccinated = sc.nextInt();

        System.out.println(Constants.RATE_OF_INFECTION);
        double rateOfInfected = sc.nextDouble();
        System.out.println(Constants.RATE_OF_RECOVERY);
        double rateOfRecovered = sc.nextDouble();

        SIR sir = new SIRImplementation(noOfSusceptible,noOfInfected,noOfRecovered,noOfVaccinated,rateOfRecovered,rateOfInfected);
        int noOfInfectionsPerDay = sir.infectionsPerDay();
        System.out.println(Constants.NO_OF_INFECTIONS_PER_DAY + noOfInfectionsPerDay);
    }
}
