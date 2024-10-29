package com.pluralsight;

import java.util.Scanner;

public class BuyOrNot {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Is a used car worth it. Lets find out. ");
        System.out.println("\nEnter name of Car: ");
        String car = s.next();

        System.out.println("What is the current mileage of the " + car);
        float currentMileage = s.nextFloat();

        System.out.println("Estimated max mileage for a " + car);
        float maxMileage = s.nextFloat();

        System.out.printf("\nWith a current mileage at %.2f and a max mileage of %.2f",
                currentMileage, maxMileage);

        float mileageLeft = maxMileage - currentMileage;
        System.out.println("\n\nThe " + car + " has " +mileageLeft+ " miles left \n current mileage : " + currentMileage);
        System.out.println("---------------------------------------------------------------");

        System.out.println("\nEnter an estimates miles per day : ");
        float milesPerDay = s.nextFloat();

        float monthsWith31Days = (milesPerDay * 31) * 7;
        System.out.printf("\nEstimated mileage for Jan, March, May, July, August, Oct, Dec : %.2f ", monthsWith31Days);
        float monthsWith30Days = (milesPerDay * 30) * 4;
        System.out.printf("\n Estimated mileage for April, June, Sept, Nov : %.2f ", monthsWith30Days);
        float monthWith29Days = (milesPerDay * 29) ;
        System.out.printf("\nEstimated mileage for Feb : %.2f ", monthWith29Days);
        System.out.println("\n---------------------------------------------------------------");

        float annualMileage = monthsWith30Days + monthsWith31Days + monthWith29Days;

        System.out.printf("\nEstimated mileage in a single year : %.2f ", annualMileage);

        System.out.println("\nHow many months are in a year? ");
        float monthsInYear = s.nextFloat();
        float estimatedYearsLeft = (mileageLeft / annualMileage) / monthsInYear ;
        System.out.printf("\nThere are %.2f months in a year \n and the estimated yearly mileage is %.2f", monthsInYear, annualMileage);

        System.out.println("\n---------------------------------------------------------------");
        System.out.printf("\nEstimated Years Left : %.2f", estimatedYearsLeft);

        System.out.print("\n---------------------------------------------------------------");

        if (estimatedYearsLeft < 3 && estimatedYearsLeft >= 4 ){
            System.out.println("\nOk ... more than 4 years isn't bad.");
        }
        if (estimatedYearsLeft >= 3) {
            System.out.println("\nMhmmm ...more than 3 years is decent I guess. But is it worth it?");
        }
        else {
            System.out.println("\n Ouuuu ... less than 2 years is a temporary decision.");
        }
    }
}
