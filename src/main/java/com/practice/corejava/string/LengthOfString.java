package com.practice.corejava.string;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        System.out.println("Characters in the string are: " + byCharAt(input));
        System.out.println("Characters in the string are: " + byToCharArray(input));

    }

    public static int byCharAt(String input) {
        int count = 0;
        try {
            while (true) {
                input.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            //
        }
        return count;
    }

    public static int byToCharArray(String input) {
        char[] chars = input.toCharArray();
        int count = 0;
        for (char c : chars) {
            count++;
        }
        return count;
    }
}
