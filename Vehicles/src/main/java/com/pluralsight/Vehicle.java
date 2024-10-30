package com.pluralsight;

public class Vehicle {


    protected String color;
    protected int numberOfPassenger;
    protected int cargoCapacity;
    protected int fuelCapacity;
    protected int maxSpeed;
    protected int currentSpeed;
    protected String type;
    protected String terrain;

    /**
     * Constructor for a vehicle object
     */
    protected Vehicle(String color,
                   int numberOfPassenger,
                   int cargoCapacity,
                   int fuelCapacity,
                   int maxSpeed,
                   int currentSpeed,
                   String type,
                   String terrain) {
        this.color = color;
        this.numberOfPassenger = numberOfPassenger;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
        this.type = type;
        this.terrain = terrain;
    }


    /**
     * Getters
     */
    protected String getColor() {
        return color;
    }

    protected int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    protected int getCargoCapacity() {
        return cargoCapacity;
    }

    protected int getFuelCapacity() {
        return fuelCapacity;
    }

    protected int getSpeedMax() {
        return maxSpeed;
    }


    protected int getSpeedCurrent() {
        return currentSpeed;
    }

    protected String getTerrain() {
        return terrain;
    }

    protected String getType() {
        return type;
    }

    /**
     * Setters
     */

    protected void setColor(String color) {
        this.color = color;
    }

    protected void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    protected void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    protected void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    protected void setSpeedMax(int speed) {
        this.maxSpeed = speed;
    }


    protected void setSpeedCurrent(int speedCurrent) {
        this.currentSpeed = speedCurrent;
    }

    protected void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    protected void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return "[ Color ] " + color +
                ",[ # of passengers ] " + numberOfPassenger +
                ",[ cargo capacity size ] " + cargoCapacity +
                ",[ fuel capacity size ] " +  fuelCapacity +
                ",[ max speed ] " + maxSpeed +
                ",[ currentSpeed ] " + currentSpeed +
                ",[ vehicle type ] " + type +
                ",[ Type of terrain ] " + terrain;
    }
}
