package com.khadija_mam_assignment;

import java.util.Scanner;

public class Correct {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        int keyNumber = 4;
	        int tries = -1;
	        int guessedNumber;

	        do {
	            System.out.print("Enter a  number: ");
	            guessedNumber = sc.nextInt();
	            tries++;
	        } while (guessedNumber != keyNumber);

	        System.out.println("Congratulations! You guessed the correct number.");
	        System.out.println("Number of tries: " + tries);
	        sc.close();
	        
	}

}
