package com.pluralsight;

public class Vehicle {


    private String color;
    private int numberOfPassenger;
    private int cargoCapacity;
    private int fuelCapacity;
    private int speedMax;
    private int speedCurrent;
    private String engine;
    private String type;
    private String terrain;

    public Vehicle() {

    }
    public Vehicle(String color, int numberOfPassenger, int fuelCapacity, int cargoCapacity, int speedMax, int speedCurrent, String engine, String terrain, String type) {
        this.color = color;
        this.numberOfPassenger = numberOfPassenger;
        this.fuelCapacity = fuelCapacity;
        this.cargoCapacity = cargoCapacity;
        this.speedMax = speedMax;
        this.speedCurrent = speedCurrent;
        this.engine = engine;
        this.terrain = terrain;
        this.type = type;
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
        return speedMax;
    }

    public String getEngine() {
        return engine;
    }

    public int getSpeedCurrent() {
        return speedCurrent;
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
        this.speedMax = speed;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setSpeedCurrent(int speedCurrent) {
        this.speedCurrent = speedCurrent;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return "the vehicle is " + this.color + " with " + this.fuelCapacity;
    }
}
