package com.switchcase;

import java.util.Scanner;

public class SalaryProvide {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Experiance");
		System.out.println("1.beginner \n2.Intermediate \n3.Expert");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.print("salary of beginner is 30000/per month");
		break;
		
		case 2:
			System.out.print("salary of Intermediate is 60000/per month");
		break;
		
		case 3:
			System.out.print("salary of beginner is 90000/per month");
		break;
		
		default:
			System.out.print("Invalid");
		
			
	}
		sc.close();

}
}
