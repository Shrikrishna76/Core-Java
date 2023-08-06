package com.basics;

import java.util.Scanner;

public class Power2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base (x): ");
        int x = scanner.nextInt();

        System.out.print("Enter the exponent (y): ");
        int y = scanner.nextInt();

        int result = calculatePower(x, y);
        System.out.println(x + " raised to the power of " + y + " is: " + result);
        scanner.close();
    }

    private static int calculatePower(int x, int y) {
        int result = 1;

        for (int i = 0; i < y; i++) {
            result *= x;
        }

        return result;
        
    }

}
