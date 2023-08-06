package com.whileloop;

import java.util.Scanner;

public class KaprekarNumber {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		int copy=num;
		int sqr=num*num;
		int sum=0;
		int count=0;
		
		while(num>0)
		{
			count++;
			num/=10;
		}
		
		int value=1;
		for(int i=1; i<=count;i++)
		{
			value*=10;
		}
		
		while(sqr>0)
		{
			int digit=sqr%value;
			sum=sum+digit;
			sqr/=value;
		}
		System.out.println(sum);
		
		if(copy==sum)
		{
			System.out.println("kaprerkar Number");
		}
		else
		{
			System.out.println(" not kaprerkar Number");
		}
		sc.close();
	}


}
