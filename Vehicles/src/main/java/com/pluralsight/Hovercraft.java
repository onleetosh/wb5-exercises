package com.pluralsight;

public class Hovercraft extends Vehicle{

    private int altitude;

    /**
     * Constructor for a hovercraft object
     */
    public Hovercraft(String color,
                   int numberOfPassenger,
                   int cargoCapacity,
                   int fuelCapacity,
                   int maxSpeed,
                   int currentSpeed,
                   String type,
                   String terrain, int altitude) {
        super(color, numberOfPassenger, cargoCapacity, fuelCapacity,
                maxSpeed, currentSpeed, type, terrain);
        this.altitude = altitude;

    }
    /**
     * Getters - get the value of an object when called
     */

    public int getAltitude() {
        return altitude;
    }

    /**
     * Setters - sets the value of an object
     */

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString(){
        return super.toString() + "| Altitude: " + altitude;

    }
}
