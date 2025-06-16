package com.practice.corejava.string;

import java.util.Scanner;

public class CountVowelConsonantInString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide a string: ");
        String string = scanner.nextLine();
        scanner.close();
//        String string = "HEllo";

        string = string.toLowerCase();
        char[] charArray = string.toCharArray();
        int vowel = 0;
        int consonant = 0;

        for (char c : charArray) {
            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowel++;
                } else consonant++;
            }
        }
        System.out.println("Vowel: " + vowel);
        System.out.println("Consonant: " + consonant);
    }
}
