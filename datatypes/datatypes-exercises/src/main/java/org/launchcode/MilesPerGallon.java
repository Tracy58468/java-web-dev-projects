package org.launchcode;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?  ");
        double milesDriven = input.nextDouble();
        System.out.println("How many gallons of gas have you used driving those miles?  ");
        double gasUsed = input.nextDouble();
        double milesPerGallon = milesDriven / gasUsed;
        System.out.println("Your gas mileage is " + milesPerGallon + " mpg.");
    }
}
