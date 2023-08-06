package com.forloop;
//write code to calculate factorial of given number.
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		System.out.print("Enter number:");
		int n=Sc.nextInt();
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		Sc.close();
		
	}
}
