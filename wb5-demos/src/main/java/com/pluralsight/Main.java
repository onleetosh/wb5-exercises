package com.pluralsight;

import com.pluralsight.animal.Cat;
import com.pluralsight.animal.Dog;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Animal fish = new Animal("Finn");
        fish.setSpecies("GoldFish");

        Dog dog = new Dog("Goku");
        dog.setSpecies("Dog");

        Cat cat = new Cat("Starboy");



        System.out.println(fish);

        System.out.println(dog);
       // dog.bark();
        System.out.println(cat);
       // cat.meow();

        System.out.println("---------------------------------------------------------------");


        ArrayList<Animal> myPets = new ArrayList<>();
        myPets.add(fish);
        myPets.add(dog);
        myPets.add(cat);

        sayHelloPets(myPets);

    }

    public static void sayHelloPets(ArrayList<Animal> pets){
        for(int i = 0; i< pets.size(); i++){
            pets.get(i).sayHello();
        }
    }
}