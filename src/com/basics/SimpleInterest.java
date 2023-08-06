package com.basics;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter principal amount:");
		int p=sc.nextInt();
		
		System.out.print("Enter  annual interest rate:");
		int r=sc.nextInt();
		
		
		System.out.print("Enter Time duration:");
		int t=sc.nextInt();
		
		System.out.print("Interest is:"+(p*r*t)/100);
		
		sc.close();
	}

}
