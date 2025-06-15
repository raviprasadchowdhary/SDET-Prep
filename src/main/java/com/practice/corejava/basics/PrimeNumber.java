package com.practice.corejava.basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        scanner.close();

        boolean isPrime = true;
        if (input <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(input); i++) {
                if (input % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(input + " is a prime number");
        } else {
            System.out.println(input + " isn't a prime number (Prime numbers are greater than 1)");
        }
    }
}
