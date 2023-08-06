package com.basics;

import java.util.Scanner;

public class Frequency {
	public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a mobile number
        System.out.print("Enter a mobile number: ");
        String mobileNumber = scanner.nextLine();
        
        // Create an array to store the frequency of each digit
        int[] frequency = new int[10]; // 10 possible digits (0-9)
        
        // Count digit frequency
        for (char digit : mobileNumber.toCharArray()) {
            if (Character.isDigit(digit)) {
                int index = digit - '0'; // Get the index for the digit
                frequency[index]++;
            }
        }
        
        // Display the frequency of each digit
        for (int i = 0; i < 10; i++) {
            System.out.println("Frequency of digit " + i + ": " + frequency[i]);
        }
        scanner.close();
    }

}
