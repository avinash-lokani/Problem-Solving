package com.example.app;

public class SIRImplementation implements SIR{
    private int noOfVaccinated;
    private int noOfSusceptible;
    private int noOfInfected;
    private int noOfRecovered;
    private double rateOfRecovered;
    private double rateOfInfected;

    public SIRImplementation(int noOfSusceptible, int noOfInfected, int noOfRecovered, int noOfVaccinated, double rateOfRecovered, double rateOfInfected) {
        this.noOfInfected = noOfInfected;
        this.noOfRecovered = noOfRecovered;
        this.noOfSusceptible = noOfSusceptible;
        this.rateOfInfected = rateOfInfected;
        this.rateOfRecovered = rateOfRecovered;
        this.noOfVaccinated = noOfVaccinated;
    }


    @Override
    public int infectionsPerDay() {
        noOfSusceptible -= noOfVaccinated;
        noOfInfected += (int)(rateOfInfected*noOfSusceptible*noOfInfected);
        noOfSusceptible -= (int) (rateOfInfected*noOfSusceptible*noOfInfected);
        noOfRecovered += (int) (rateOfRecovered*noOfInfected);
        noOfInfected -= (int) (rateOfRecovered*noOfInfected);

        return noOfInfected;
    }
}
