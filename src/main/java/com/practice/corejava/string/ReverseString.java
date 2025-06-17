package com.practice.corejava.string;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inputString = scanner.next();
        scanner.close();

        char[] charArray = inputString.toCharArray();
        String reverseString = "";
        for (char c : charArray) {
            reverseString = c + reverseString;
        }

        System.out.print("Reverse word: " + reverseString);
    }
}
