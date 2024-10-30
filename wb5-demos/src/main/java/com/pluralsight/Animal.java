/**
 *  Parent Class - Hierarchy at the top
 */

package com.pluralsight;

public class Animal {

    protected String name;
    protected float weight;
    protected int age;
    protected String coat;
    protected String species;

    protected Animal(String name){
        //trace entry - turn off after testing how it runs
        System.out.println("TRACE -- from animal constructor");
        this.name = name;
        this.species = "Unknown";

    }
    /**
     * Getters
     */

    protected String getName() {
        return name;
    }
    protected float getWeight() {
        return weight;
    }
    protected int getAge() {
        return age;
    }

    protected String getCoat() {
        return coat;
    }

    protected String getSpecies() {
        return species;
    }

    /**
     * Setters
     */

    protected void setName(String name) {
        this.name = name;
    }

    protected void setCoat(String coat) {
        this.coat = coat;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected void setSpecies(String species){
        this.species = species;
    }

    /***
     * This method tracks the amount of weight gained when a dog eats
     */
    protected void eat(float amountOfFood) {
        this.weight = amountOfFood;
    }


    /***
     * This method tracks the amount of weight losses when a dog diets
     */
    protected void diet(float amountOfFood) {

        this.weight = amountOfFood;
    }

    protected void sayHello(){
        System.out.println("[silence]");
    }

    @Override
    public String toString(){
        return this.name + " is my pet " + this.species;
    }


}
