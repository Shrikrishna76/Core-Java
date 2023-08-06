package com.whileloop;
//write code to check given number is spy number.
import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		int sum=0;
		int mul=1;
		int digit;
		
		while(num>0)
		{
			digit=num%10;
			sum=sum+digit;
			mul=mul*digit;
			num=num/10;
			
		}
		if(sum==mul)
		{
			System.out.print("Spy");
		}
		else
		{
			System.out.print("Not spy");
		}
		sc.close();
	}

}
