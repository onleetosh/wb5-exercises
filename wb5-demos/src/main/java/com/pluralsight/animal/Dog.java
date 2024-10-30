/**
 * Subclass - 2nd level extension of Animal parent class
 */

package com.pluralsight.animal;

import com.pluralsight.Animal;

//extend allow subclass to call methods from parent class
public class Dog extends Animal {

    private String breed;

    public Dog(String name) {
        super(name);
        System.out.println("TRACE -- from dog constructor");
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
    public void sayHello(){
        bark();
    }
}
