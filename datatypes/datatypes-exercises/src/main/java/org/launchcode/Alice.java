package org.launchcode;

import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?";

        Scanner input = new Scanner(System.in);
        System.out.println("What word would you like to search for?  ");
        String word = input.next();
        Boolean containsWord = sentence.toLowerCase().contains(word.toLowerCase());
        Integer wordIndex = sentence.indexOf(word);
        Integer wordLength = word.length();
        String[] newSentenceArray = sentence.split(word);
        String newSentence = newSentenceArray[0].concat(newSentenceArray[1]);
        System.out.println(containsWord);
        System.out.println(wordIndex);
        System.out.println(wordLength);
        System.out.println(newSentence);
    }
}

// Next, remove the word from the string and print the sentence again to confirm your code. Remember that strings are immutable, so you will need to reassign the old sentence variable or create a new one to store the updated phrase.