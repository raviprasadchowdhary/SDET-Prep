package com.practice.corejava.basics;

import java.util.Scanner;

public class SumOfDigitsOfGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = 0;
        while (number > 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }

        System.out.print("Sum of digits of input is: " + sum);
    }
}
