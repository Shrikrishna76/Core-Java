package com.ifelsestatement;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Salary of employee:");
		int salary=sc.nextInt();
		
		System.out.print("Enter year of service of employee:");
		int service=sc.nextInt();
		
		int net=salary*5/100;
		
		if(service>=5)
		{
			
			System.out.print("your net bonus is:"+net);
		}
		else
		{
			System.out.println("Your service not more than 5 years");
		}
		sc.close();

	}

}
