package com.whileloop;

import java.util.Scanner;

public class FactorsSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		int i=1;
		int sum = 0;
		while(i<=num)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			i++;
			
		}System.out.print(sum);
		sc.close();
	}

}
