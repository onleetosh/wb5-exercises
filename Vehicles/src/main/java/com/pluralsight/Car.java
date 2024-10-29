package com.pluralsight;

public class Car extends Vehicle {

    private int windows;
    private int mirrors;

    /**
     * Constructor for a car object
     */
    public Car(String color,
               int numberOfPassenger,
               int cargoCapacity,
               int fuelCapacity,
               int maxSpeed,
               int currentSpeed,
               String type,
               String terrain,
               int windows,
               int mirrors) {
        super(color, numberOfPassenger, cargoCapacity, fuelCapacity,
                maxSpeed, currentSpeed, type, terrain);
        this.windows = windows;
        this.mirrors = mirrors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getMirrors() {
        return mirrors;
    }

    public void setMirrors(int mirrors) {
        this.mirrors = mirrors;
    }
    @Override
    public String toString(){
        return super.toString() + "| # of windows" + windows + "| # of mirrors" + mirrors;
    }
}
