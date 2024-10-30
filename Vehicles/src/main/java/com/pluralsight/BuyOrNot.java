/***
 * PET Addition
 */

package com.pluralsight;

import java.util.Scanner;

public class BuyOrNot {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Is a used car worth it. Lets find out. ");
        System.out.println("\nEnter name of Car: ");
        String car = s.next();

        System.out.println("What is the current mileage of the " + car);
        int currentMileage = s.nextInt();

        System.out.println("Estimated max mileage for a " + car);
        int maxMileage = s.nextInt();

        System.out.println("\nWith a current mileage at" + currentMileage + "and a max mileage of " + maxMileage);

        int mileageLeft = maxMileage - currentMileage;
        System.out.println("\n\nThe " + car + " has " +mileageLeft+ " miles left \n current mileage : " + currentMileage);
        System.out.println("Estimated mileage remaining per expiration : " + mileageLeft);
        System.out.println("---------------------------------------------------------------");

        System.out.println("\nEnter an estimates miles per day : ");
        int milesPerDay = s.nextInt();

        System.out.println("Work miles in a week?");
        int workMilesPerWeek = s.nextInt();

        int monthsWith31Days = (milesPerDay * 31) * 7;
        System.out.println("\nEstimated mileage for Jan, March, May, July, August, Oct, Dec: " +  monthsWith31Days + " miles");
        int monthsWith30Days = (milesPerDay * 30) * 4;
        System.out.println("\n Estimated mileage for April, June, Sept, Nov: " + monthsWith30Days + " miles");
        int monthWith29Days = (milesPerDay * 29) ;
        System.out.println("\nEstimated mileage for Feb : "+ monthWith29Days + " miles");
        System.out.println("\n---------------------------------------------------------------");

        int annualMileage = monthsWith30Days + monthsWith31Days + monthWith29Days;

        System.out.print("\nEstimated mileage in a single year : "+ annualMileage + " miles");

        System.out.println("\nHow many months are in a year? ");
        int monthsInYear = s.nextInt();
        int estimatedYearsLeft = (mileageLeft / annualMileage) / monthsInYear ;
        System.out.println("\nThere are " + monthsInYear + " months in a year \n and the estimated yearly mileage is "+ annualMileage);

        System.out.println("\n---------------------------------------------------------------");
        System.out.println("\n [whole number}Estimated possible years with the " +car+ ": " + estimatedYearsLeft);

        System.out.println("\n---------------------------------------------------------------");

        float currentMileageFloat = currentMileage;
        float maxMileageFloat = maxMileage;
        float mileageLeftFloat = maxMileageFloat - currentMileageFloat;

        float monthsWith31DaysFloat = monthsWith31Days;
        float monthsWith30DaysFloat = monthsWith30Days;
        float monthsWith29DaysFloat = monthWith29Days;

        float annualMileageFloat = monthsWith30DaysFloat + monthsWith31DaysFloat + monthsWith29DaysFloat;

        float monthsInYearFloat = monthsInYear;

        float estimatedYearsLeftFloat = (mileageLeftFloat / annualMileageFloat) / monthsInYearFloat ;

        System.out.println("\n---------------------------------------------------------------");
        System.out.printf("\n [Float output]Estimated years remaining as : %.2f", estimatedYearsLeftFloat);
        System.out.println("\n---------------------------------------------------------------");



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
