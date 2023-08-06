 package com.khadija_mam_assignment;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		int rem=0;
		int sum=0;
		int temp;
		temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num/=10;
			
			
		}
		if(temp%sum==0)
		{
			System.out.println(temp+" is a harshad number");
		}
		else
		{
			System.out.println(temp+" is not harshad number");
		}
		sc.close();
		
	}

}
