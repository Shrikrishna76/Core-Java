package com.forloop;
//write code to find out the sum of factors of given number.

import java.util.Scanner;

public class FactorsSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		int sum=0;
		int i;
		for(i=1; i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
				sum=sum+i;	
			}
			sc.close();
		}
		System.out.println(sum);
	}

}
