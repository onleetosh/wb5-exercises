/**
 *  Derived Class
 */
package com.pluralsight.asset;

import com.pluralsight.Asset;

public class House extends Asset {

    /***
     * Properties
     */
    private String address;
    private int condition; // (rating scale: 1- excellent, 2- good, 3- fair, 4-poor)
    private int squareFoot;
    private int lotSize;



    /**
     * Constructor for house object
     */
    public House(String description,
                 String dateAcquired,
                 double originalCost,
                 String address,
                 int condition,
                 int squareFoot,
                 int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    /***
     * Getters
     */
    public String getAddress() {
        return address;
    }

    public int getCondition() {
        return condition;
    }

    public int getSquareFeet() {
        return squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }
    /***
     * Setters
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFoot = squareFeet;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    /***
     *  determine the value of a house
     */
    @Override
    public double getValue() {

        double pricePerSquareFoot = 0; //default to a value of $0

        switch (condition) {
            //$180.00 per square foot (excellent)
            case 1 -> pricePerSquareFoot = 180.00;
            //$130.00 per square foot (good)
            case 2 -> pricePerSquareFoot = 130.00;
            //$90.00 per square foot (fair)
            case 3 -> pricePerSquareFoot = 90.00;
            //$80.00 per square foot (poor)
            case 4 -> pricePerSquareFoot = 80.00;
            default -> throw new IllegalStateException("Unexpected value: " + condition);
        }

        double houseValue = pricePerSquareFoot * squareFoot;
        // Add value for addition lot size: 25 cents per square foot of lot size
        double lotValue = 0.25 * lotSize;
        // Return the total value
        return houseValue + lotValue;
    }

    @Override
    public String toString(){
        return super.toString() + ", Address: " + address +
                ", Condition: " + condition +
                ", Square Foot: " + squareFoot +
                ", Lot Size: " + lotSize;
    }
}


