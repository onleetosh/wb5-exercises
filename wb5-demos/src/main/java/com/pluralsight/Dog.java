/**
 * Subclass - 2nd level extension of Animal parent class
 */

package com.pluralsight;

//extend allow subclass to call methods from parent class
public class Dog extends Animal{

    private String breed;
//default constructor with no value
    public Dog() {
        super.setSpecies("Dog");
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        // super.inherent a method from a parent class
        if (super.getWeight() < 50) {
            System.out.println("BARK!");
        }
        else {
            System.out.println("WOOF!");

        }
    }
}
