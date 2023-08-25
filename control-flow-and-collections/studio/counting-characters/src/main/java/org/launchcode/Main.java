package org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {

        String hiddenFigures = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = hiddenFigures.toCharArray();

//        System.out.println(charactersInString);
//        for (char i : charactersInString)
//            System.out.println(i);

//        ArrayList<Character> charType = new ArrayList<>();

//        for (char i : charactersInString) {
//            System.out.println(charactersInString[i]);
//            if (charType.contains(charactersInString[i])) {
//                continue;
//            } else {
//                charType.add(charactersInString[i]);
//            }
//            System.out.println(charType);
//        }

//        System.out.println(charType);

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char i : charactersInString) {
            if (!charCount.containsKey(i)) {
                charCount.put(i, 1);
            } else if (charCount.containsKey(i)){
                for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                   if (entry.getKey().equals(i)) {
                       entry.setValue(entry.getValue() + 1);
                   }
                }
            }
        }

//        System.out.println(charCount.getKey() ":");
//        for (Map.EngrySystem.out.printf(%s%s, charCount.keySet())
        for (Map.Entry<Character, Integer> count : charCount.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }

//        Character[] charType;
//        Integer charCount;




// look at each character in charactersInString and if it's not already in charType, add it

    }



}