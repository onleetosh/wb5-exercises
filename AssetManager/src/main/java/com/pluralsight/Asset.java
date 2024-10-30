/**
 *  Base Class - Hierarchy at the top
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
    protected Asset(String description,
                 String dateAcquired,
                 double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    /***
     * Getters
     */
    protected String getDescription() {
        return description;
    }

    protected String getDateAcquired() {
        return dateAcquired;
    }

    protected double getOriginalCost() {
        return originalCost;
    }
    /***
     * Setters
     */
    protected void setDescription(String description) {
        this.description = description;
    }

    protected void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    protected void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }


    protected double getValue(){
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
                ", Original Cost: " + originalCost;
    }
}
