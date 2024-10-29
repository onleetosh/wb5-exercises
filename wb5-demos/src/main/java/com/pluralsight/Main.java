package com.pluralsight;

import com.pluralsight.animal.Cat;
import com.pluralsight.animal.Dog;

public class Main {
    public static void main(String[] args) {


        Animal fish = new Animal("Finn");
        fish.setSpecies("GoldFish");

        Dog dog = new Dog("Goku");
        dog.setSpecies("Dog");

        Cat cat = new Cat("Starboy");



        System.out.println(fish);

        System.out.println(dog);
        dog.bark();
        System.out.println(cat);
        cat.meow();




    }
}