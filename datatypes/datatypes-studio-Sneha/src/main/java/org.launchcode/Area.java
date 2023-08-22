package org.launchcode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius:");
        boolean isValidNum = false;
                double radius = input.nextDouble();
        try {
            while (!isValidNum)
                if (radius < 0) {
                    System.out.println("Enter a positive number for a radius!");
                    radius= input.nextDouble();

                }
                else {
                    isValidNum = true;
                    Double areaCircle= Circle.getArea(radius);
                    System.out.println("Area of the circle is: " + areaCircle );
                }

    }
    catch (InputMismatchException e) {
        System.out.println("Not a valid input! Quitting.");
//       println("Area of the circle is: " + areaCircle );
//        System.exit();
    }


        input.close();

    }
}
