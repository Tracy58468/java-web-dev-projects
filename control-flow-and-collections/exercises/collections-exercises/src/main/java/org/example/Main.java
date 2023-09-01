package org.example;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        int[] integerArray = {1, 1, 2, 3, 5, 8};
        String eggsAndHam = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] eggsAndHamStringArray = eggsAndHam.split("\\. ");

        System.out.println(Arrays.toString(eggsAndHamStringArray));

        for (int i : integerArray) {

            if (i % 2 != 0) {
                System.out.println(i);
            }

        }

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(7);
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(30);
        numbers.add(13);
        numbers.add(21);
        numbers.add(15);
        numbers.add(2);

        System.out.println(sumEven(numbers));

        ArrayList<String> words = new ArrayList<>();

        words.add("time");
        words.add("timer");
        words.add("times");
        words.add("timetable");
        words.add("tim");

//        System.out.println(words);
        System.out.println(printWords(words));

    }

    public static int sumEven(ArrayList<Integer> numbers) {

        int j = 0;

        for (int k : numbers) {
            if (k % 2 == 0) {
                j = j + k;
            }

        }

        return j;

    }

    public static ArrayList printWords(ArrayList<String> words) {

        ArrayList<String> pickedWords = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of letters you would like to search for. ");

        int numChars = input.nextInt();

        for (String m : words) {
            if (m.length() == numChars) {
                pickedWords.add(m);
//                System.out.println("pickedWords end " + pickedWords);
            }
        }

        return pickedWords;
    }

}