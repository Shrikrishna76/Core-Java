package com.khadija_mam_assignment;

import java.util.Scanner;

public class Increasing {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int ld = num % 10;
	        num = num / 10;
	        boolean isIncreasing = true;

	        while (num > 0) {
	            int cd = num % 10;
	            if (cd >= ld) {
	                isIncreasing = false;
	                break;
	            }
	            ld = cd;
	            num = num / 10;
	        }

	        if (isIncreasing) {
	            System.out.println("The number is increasing.");
	        } else {
	            System.out.println("The number is not increasing.");
	        }

	        sc.close();
	}

}
