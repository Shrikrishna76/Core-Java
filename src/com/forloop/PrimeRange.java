package com.forloop;

import java.util.Scanner;

public class PrimeRange {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr number:");
		int num=sc.nextInt();
		int sum=0;
		int j=1;
		int i=1;
		sc.close();
		for( i=2; i<=num; i++)
		{
			boolean isprime=true;
			
			for( j=2; j<i;j++)
			{
				if(i%j==0)
				{
					isprime=false;
					break;
				}
				
			}
			
			if(isprime==true)
			{
				sum+=i;
				System.out.println(i);
				
			}
			
		}
		System.out.print(sum);
		
	}

}
