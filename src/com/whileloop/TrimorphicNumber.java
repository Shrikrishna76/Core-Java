package com.whileloop;

import java.util.Scanner;

public class TrimorphicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr the number:");
		int n=sc.nextInt();
		int count=0;
		int temp=n;
		int cube=n*n*n;
		System.out.println("Cube of number is:"+cube);
		
		while(n>0)
		{
			
			count++;
			n=n/10;
		}
		
		int a=cube%(int)Math.pow(10,count);
		System.out.println("Last digit of cube:"+a);
		
		if(temp==a)
		{
			System.out.println("Trimorphic");
		}
		else
		{
			System.out.println("Not");
		}
		sc.close();
		
	}
}
