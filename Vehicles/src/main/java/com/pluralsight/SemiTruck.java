package com.pluralsight;

public class SemiTruck extends Vehicle {

    private int wheels;
    private String cargo;
    boolean hasAttachment;

    /**
     * Constructor for a semi-truck object
     */
    public SemiTruck(String color,
                   int numberOfPassenger,
                   int cargoCapacity,
                   int fuelCapacity,
                   int maxSpeed,
                   int currentSpeed,
                   String type,
                   String terrain,
                     int wheels,
                     String cargo,
                     boolean hasAttachment) {
        super(color, numberOfPassenger, cargoCapacity, fuelCapacity,
                maxSpeed, currentSpeed, type, terrain);
        this.wheels = wheels;
        this.cargo = cargo;
        this.hasAttachment = hasAttachment;
    }

    /**
     * Getters - get the value of an object when called
     */

    public int getWheels() {
        return wheels;
    }

    public String getCargo() {
        return cargo;
    }

    public boolean isHasAttachment() {
        return hasAttachment;
    }

    /**
     * Setters - sets the value of an object
     */
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setHasAttachment(boolean hasAttachment) {
        this.hasAttachment = hasAttachment;
    }
    @Override
    public String toString(){
        return super.toString() +
                ",[ # of wheels ] " + wheels +
                ",[ cargo hold ] " + cargo +
                ",[ attachment ] " + hasAttachment;
    }
}
