package com.switchcase;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first number:");
		int n1=sc.nextInt();
		System.out.print("Enter Second number:");
		int n2=sc.nextInt();
		
		System.out.print("Enter oprator:");
		char op=sc.next().charAt(0);
				
		switch(op)
		{
		case '+':
			System.out.print("Addition is:"+(n1+n2));
		break;
		
		case '-':
			System.out.print("subtraction is:"+(n1-n2));
		break;
		
		case '*':
			System.out.print("multiplication is:"+(n1*n2));
		break;
		
		case '/':
			System.out.print("division is:"+(n1/n2));
		break;
		
		default:
			System.out.print("Invalid oprator");
		}
		sc.close();
		
	}

}
