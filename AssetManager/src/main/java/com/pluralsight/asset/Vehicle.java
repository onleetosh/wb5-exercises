/**
 *  Derived Class
 */
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
        int vehicleAge = 2024 - year; // Calculate the vehicle's age (assuming current year is 2024)
        double reducedValue = 0;

        // Determine reduced value of cost per year based on vehicle age
        if (vehicleAge >= 0 && vehicleAge <= 3) { //if 0-3 years
            reducedValue = 0.03 * vehicleAge; // 3% reduced value
        } else if (vehicleAge >= 4 && vehicleAge <= 6) { //if 4-6 years
            reducedValue = 0.06 * vehicleAge; // 6% reduced value
        } else if (vehicleAge >= 7 && vehicleAge <= 10) { // if 7-10 years
            reducedValue = 0.08 * vehicleAge; // 8% reduced value
        } else if (vehicleAge > 10) { //if 10+ years
            reducedValue = 1000; // $1,000
        }
        
        double currentValue = getOriginalCost() * (1 - reducedValue);

        // Unless makeModel contains words Honda or Toyota
        if (odometer > 100000 && !makeModel.toLowerCase().contains("honda") && !makeModel.toLowerCase().contains("toyota")) {
            currentValue *= 0.75; // Reduce value by 25% if over 100,000 miles
        }

        // Ensure value does not go below zero
        return Math.max(currentValue, 0);

    }

    @Override
    public String toString(){
        return super.toString() + ", Make/Model: " + makeModel +
                ", Year: " + year +
                ", Odometer: " + odometer;
    }
}

