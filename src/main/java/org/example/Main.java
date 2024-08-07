package org.example;

import org.example.entity.StringSet;

public class Main {
    public static void main(String[] args) {
        String cleanedText = "Hello  World   How are you?";
        String[] words = cleanedText.split(" ");
        for (String word : words) {
            System.out.println(word);

        }
        System.out.println("*******************");
        String cleanedText1 = "Hello  World   How are you?";
        String[] words1 = cleanedText.split("\\s+");
        for (String word : words1) {
            System.out.println(word);
        }
        System.out.println(StringSet.findUniqueWords().size());
    }
}