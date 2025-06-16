package com.practice.corejava.array;

import java.util.Scanner;

public class PrintEvenOddInIntegerArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int count = scanner.nextInt();

        int[] integers = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Provide integer" + (i + 1) + ": ");
            integers[i] = scanner.nextInt();
        }
        scanner.close();
//        int[] integers = {2, 1, 3, 5, 8, 10, 12, 15};

        System.out.print("Even numbers in the given array are: ");
        for (int num : integers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.print("Odd numbers in the given array are: ");
        for (int num : integers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
