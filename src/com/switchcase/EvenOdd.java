package com.switchcase;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		
		
	switch(n%2)
		{
		case 0:
			System.out.print("Even number");
		break;
		
		default :
			System.out.print("odd number");
		}
		sc.close();

	}

}
