/**
 *  Base Class - Hierarchy at the top; Abstract marks the constructor Unusable and can
 */
package com.pluralsight;


public class Asset {

    /***
     * Properties
     */
    protected String description;
    protected String dateAcquired;
    protected double originalCost;

    /**
     * Constructor for asset object
     */
    public Asset(String description,
                 String dateAcquired,
                 double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    /***
     * Getters
     */
    public String getDescription() {
        return description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }
    /***
     * Setters
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }


    public double getValue(){
        return getOriginalCost();
    }

    /**
     * The presence of the toString() method displays objects in a print statement
     * Override toString() for a custom implementation
     */
    @Override
    public String toString(){
        return "Description: " + description +
                ", Date acquired: " + dateAcquired +
                ", Original Cost: $" + originalCost;
    }
}
