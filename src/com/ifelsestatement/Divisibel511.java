package com.ifelsestatement;

import java.util.Scanner;

public class Divisibel511 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		if((num%5==0) &&( num%11==0))
		{
			System.out.print("Divisible by 5 & 11");
		}
		else if (num%5==0)
		{
			System.out.print("Divisibel by 5");
		}
		else if(num%11==0)
		{
			System.out.print("Divisible by 11");
		}

		else
		{
			System.out.print("No");
		}
		sc.close();
	}

}
