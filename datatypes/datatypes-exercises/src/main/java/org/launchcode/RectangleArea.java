package org.launchcode;

import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the short side  ");
        Double shortSide = input.nextDouble();
        System.out.println("What is the length of the long side  ");
        Double longSide = input.nextDouble();
        Double area = shortSide * longSide;
        System.out.println("The area of your rectangle is " + area);
    }
}
