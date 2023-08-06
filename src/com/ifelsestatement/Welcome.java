package com.ifelsestatement;

import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		
		 if((num%3==0) &&( num%5==0))
		{
			System.out.print("Welcome");
		}
		else if (num%3==0)
		{
			System.out.print("Hi");
		}
		else if(num%5==0)
		{
			System.out.print("Hello");
		}
		
		else
		{
			System.out.print("No");
		}
		 sc.close();
	}

}
