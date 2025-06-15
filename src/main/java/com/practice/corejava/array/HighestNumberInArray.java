package com.practice.corejava.array;

import java.util.Scanner;

public class HighestNumberInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int arrayLength = scanner.nextInt();

        int[] numbers = new int[arrayLength];
        for (int i = 1; i <= arrayLength; i++) {
            System.out.print("Enter number" + i + ": ");
            numbers[i - 1] = scanner.nextInt();
        }
        scanner.close();

        int highest = numbers[0];   //Assume first number is highest
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }

        System.out.println("Highest number in the array is: " + highest);
    }
}
