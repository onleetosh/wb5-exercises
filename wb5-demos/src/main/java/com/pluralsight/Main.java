package com.pluralsight;

public class Main {
    public static void main(String[] args) {


        Animal fish = new Animal();
        fish.setName("Finn");
        fish.setSpecies("GoldFish");

        Dog dog = new Dog();
        dog.setName("Goku");
        dog.setSpecies("Dog");

        Cat cat = new Cat();
        cat.setName("Starboy");



        System.out.println(fish);

        System.out.println(dog);
        dog.bark();
        System.out.println(cat);
        cat.meow();




    }
}