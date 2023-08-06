package com.whileloop;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		System.out.print("Enter number to find how many time arrive:");
		int f=sc.nextInt();
		
		int digit;
		int count=0;
		
		while(num>0)
		{
			digit=num%10;
			if(digit==f)
			{
				count++;
				
			}
			num=num/10;
			
			
		}
		System.out.println(count);
		
		sc.close();
	}

}
