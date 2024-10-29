/**
 *  Parent Class - Hierarchy at the top
 */

package com.pluralsight;

public class Animal {

    private String name;
    private float weight;
    private int age;
    private String coat;
    private String species;

    public Animal(String name){
        //trace entry - turn off after testing how it runs
        System.out.println("TRACE -- from animal constructor");
        this.name = name;
        this.species = "Unknown";

    }
    /**
     * Getters
     */

    public String getName() {
        return name;
    }
    public float getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }

    public String getCoat() {
        return coat;
    }

    public String getSpecies() {
        return species;
    }

    /**
     * Setters
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species){
        this.species = species;
    }

    /***
     * This method tracks the amount of weight gained when a dog eats
     */
    public void eat(float amountOfFood) {
        this.weight = amountOfFood;
    }


    /***
     * This method tracks the amount of weight losses when a dog diets
     */
    public void diet(float amountOfFood) {

        this.weight = amountOfFood;
    }

    @Override
    public String toString(){
        return this.name + " is my pet " + this.species;
    }


}
