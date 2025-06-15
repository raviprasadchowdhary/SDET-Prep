package com.practice.corejava.basics;

import java.util.Scanner;

public class SwapTwoNumbersWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        scanner.close();

        number1 = number1 + number2;    // a=2+3
        number2 = number1 - number2;    // b=5-3=2
        number1 = number1 - number2;    // a=5-2=3

        System.out.println("After swapping, Number1: " + number1);
        System.out.println("After swapping, Number2: " + number2);
    }
}
