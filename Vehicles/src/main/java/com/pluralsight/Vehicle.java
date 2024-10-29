package com.pluralsight;

public class Vehicle {


    private String color;
    private int numberOfPassenger;
    private int cargoCapacity;
    private int fuelCapacity;
    private int maxSpeed;
    private int currentSpeed;
    private String type;
    private String terrain;

    /**
     * Constructor for a vehicle object
     */
    public Vehicle(String color,
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
    public String getColor() {
        return color;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getSpeedMax() {
        return maxSpeed;
    }


    public int getSpeedCurrent() {
        return currentSpeed;
    }

    public String getTerrain() {
        return terrain;
    }

    public String getType() {
        return type;
    }

    /**
     * Setters
     */

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setSpeedMax(int speed) {
        this.maxSpeed = speed;
    }


    public void setSpeedCurrent(int speedCurrent) {
        this.currentSpeed = speedCurrent;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return "Color: " + color +
                "| # of passengers: " + numberOfPassenger +
                "| cargo capacity size: " + cargoCapacity +
                "| fuel capacity size: " +  fuelCapacity +
                "| max speed: " + maxSpeed +
                "| currentSpeed: " + currentSpeed +
                "| vehicle type: " + type +
                "| Type of terrain: " + terrain;
    }
}
