/**
 * Subclass - 2nd level extension of Animal parent class
 */
package com.pluralsight.animal;

import com.pluralsight.Animal;

public class Cat extends Animal {

    public Cat(String name){
        super(name);
        System.out.println("TRACE -- from cat constructor");

        super.setSpecies("Cat");
    }

    public void meow(){
        System.out.println("Meoww");
    }

}
