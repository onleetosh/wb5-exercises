/**
 *  Base Class - Hierarchy at the top
 */
package com.pluralsight;

public class Asset {

    /***
     * Properties
     */
    private String description;
    private String dateAcquired;
    private double originalCost;

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

    @Override
    public String toString(){
        return "Description: " + description +
                ", Date acquired: " + dateAcquired +
                ", Original Cost: " + originalCost;
    }
}
