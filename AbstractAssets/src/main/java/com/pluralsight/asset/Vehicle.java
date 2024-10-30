package com.pluralsight.asset;

import com.pluralsight.Asset;

public class Vehicle extends Asset {
    /***
     * Properties
     */
    private String makeModel;
    private int year;
    private int odometer;

    /**
     * Constructor for vehicle object
     */

    public Vehicle(String description,
                   String dateAcquired,
                   double originalCost,
                   String makeModel,
                   int odometer,
                   int year) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.odometer = odometer;
        this.year = year;
    }

    /***
     * Getters
     */
    public String getMakeModel() {
        return makeModel;
    }

    public int getYear() {
        return year;
    }

    public int getOdometer() {
        return odometer;
    }

    /***
     * Setters
     */
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    /***
     * Determine a Vehicle's value
     */

    @Override
    public double getValue() {
        int vehicleAge = 2024 - year;
        double reducedValue = 0;

        if (vehicleAge <= 3) {
            reducedValue = 0.03 * vehicleAge;
        } else if (vehicleAge >= 4 && vehicleAge <= 6) {
            reducedValue = 0.06 * vehicleAge;
        } else if (vehicleAge >= 7 && vehicleAge <= 10) {
            reducedValue = 0.08 * vehicleAge;
        } else if (vehicleAge > 10) { //if 10+ years
            return 1000;
        }

        double currentValue = getOriginalPrice() * (1 - reducedValue);

        if (odometer > 100000 && !makeModel.toLowerCase().contains("honda") &&
                !makeModel.toLowerCase().contains("toyota")) {
            currentValue *= 0.75;
        }
        return currentValue;
    }

    @Override
    public String toString(){
        return super.toString() + ", Make/Model: " + makeModel +
                ", Year: " + year +
                ", Odometer: " + odometer;
    }
}

