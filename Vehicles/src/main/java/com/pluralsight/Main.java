package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        System.out.println(slowRide);


        Car honda = new Car();
        honda.setColor("Blue");
        honda.setFuelCapacity(10);

        System.out.println(honda);

    }
}