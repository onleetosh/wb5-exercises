/**
 * Abstract marks the constructor as unusable for creating an object by the Parent class
 *
 */
package com.pluralsight;

public abstract class Asset {

    protected String description;
    protected String dateAcquired;
    protected double originalPrice;

    public Asset(String description, String dateAcquired, double originalPrice){
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalPrice = originalPrice;
    }

    public String getDescription(){
        return description;
    }

    public String getDateAcquired(){
        return dateAcquired;
    }

    public double getOriginalPrice(){
        return originalPrice;
    }

    public void setDescription(){
        this.description = description;
    }

    public void setDateAcquired(){
        this.dateAcquired = dateAcquired;
    }

    public void setOriginalPrice(){
        this.originalPrice = originalPrice;
    }

    public abstract double getValue();


    public String toString(){
        return "Description: " + description +
                ", Date acquired: " + dateAcquired +
                ", Original Cost: $" + originalPrice;
    }
}
