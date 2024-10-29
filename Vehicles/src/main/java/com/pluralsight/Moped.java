package com.pluralsight;

public class Moped extends Vehicle {

    private int numberOfHeadLight;

    /**
     * Constructor for a moped object
     */
    public Moped(String color,
                 int numberOfPassenger,
                 int cargoCapacity,
                 int fuelCapacity,
                 int maxSpeed,
                 int currentSpeed,
                 String type,
                 String terrain,
                 int numberOfHeadLight) {
        super(color, numberOfPassenger, cargoCapacity, fuelCapacity,
                maxSpeed, currentSpeed, type,terrain);
        this.numberOfHeadLight = numberOfHeadLight;
    }

    /**
     * Getters
     */
    public int getNumberOfHeadLight() {
        return numberOfHeadLight;
    }

    /**
     * Setters
     */
    public void setNumberOfHeadLight(int numberOfHeadLight) {
        this.numberOfHeadLight = numberOfHeadLight;
    }




}
