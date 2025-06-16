package com.practice.corejava.array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int count = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter the number" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        scanner.close();

//        int[] array = {1, 2, 4, 5};

        System.out.print("Reversed array: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }
        System.out.println();

        System.out.print("Reversed array: ");
        for (int j : reverseArray) {
            System.out.print(j + " ");
        }
    }
}
