package com.ifelsestatement;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number1:");
		int num1=sc.nextInt();
		
		System.out.print("Enter number2:");
		int num2=sc.nextInt();
		
		System.out.print("Enter number3:");
		int num3=sc.nextInt();
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("Maximum number is :"+num1);
			}
			else
			{
				System.out.println("Maximum number is :"+num2);
			}
		}
		else 
		{
			System.out.println("Maximum number is :"+num3);
		}
		
		sc.close();
	}

}
