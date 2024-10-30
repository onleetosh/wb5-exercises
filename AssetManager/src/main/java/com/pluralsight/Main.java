package com.pluralsight;

import com.pluralsight.asset.House;
import com.pluralsight.asset.Vehicle;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /**
         * Declare an empty ArrayList to hold asset objects
         */
        ArrayList<Asset> assets = new ArrayList<>();

        /**
         * Create two House objects and add them to the ArrayList
         */

        House house1 = new House("Lower East Side Area",
                "10-20-2024",
                6155,
                "309 Avenue C, Apt 10-E, Manhattan, NY",
                1,
                948,
                100);
        House house2 = new House("Riverdale Area",
                "10-21-2023",
                6200,
                "385 W 263rd St, Bronx, NY",
                1,
                2100,
                200);

        assets.add(house1);
        assets.add(house2);

        /**
         * Create two Vehicles objects and add them to the  ArrayList
         */
        Vehicle vehicle1 = new Vehicle("Pop Out Vehicle",
                "10-20-2024",
                26000,
                "Tesla",
                43942,
                2023);

        Vehicle vehicle2 = new Vehicle("Everyday Vehicle",
                "10-20-2023",
                23000,
                "Honda",
                24824,
                2022);

        assets.add(vehicle1);
        assets.add(vehicle2);

        String customString = " ";

        /***
         * Loop through the ArrayList and display all objects with a custom String format.
         *  Use instanceof to detect a specific type of object in the collection
         */
        for (int i = 0; i < assets.size(); i++){
            // using instanceof to detect House  objects
           if(assets.get(i) instanceof House) {
               House house = (House) assets.get(i); //get the objects from ArrayList
               customString = "[Address] " + house.getAddress() +
                       " | [Original Cost] $" + house.getOriginalCost() +
                       " | [Current Value] $" + house.getValue();
           }
           // using instanceof to detect Vehicle  objects
           else if(assets.get(i) instanceof Vehicle){
               Vehicle vehicle = (Vehicle) assets.get(i); //get the objects from ArrayList
               customString = String.format("[Year] " + vehicle.getYear() +
                       " | [Make/Model] " + vehicle.getMakeModel() +
                       " | [Value] $" + vehicle.getValue());
           }
           //display Assets with a custom string format
           System.out.println(customString);
        }


    }
}