package com.khadija_mam_assignment;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a single-digit number: ");
	        int num = sc.nextInt();

	        int sum = 0;
	        System.out.print("Even number is:");
	        while (num > 0) {
	            int digit = num % 10;
	            if (digit % 2 == 0) {
	            	
	            	System.out.print(digit+",");
	                sum += digit;
	            }
	            
	            num = num / 10;
	        }

	        System.out.print("\nThe sum of even numbers is: " + sum);
	        
	        sc.close();

	     
	}

}
