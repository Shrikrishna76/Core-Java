package com.khadija_mam_assignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr number:");
		int num=sc.nextInt();
		sc.close();
		
		for(;num>1;num=num/10)
		{
			int rem=num%10;
			boolean isprime=true;
			for(int i=2; i<rem;i++)
			{
				if(rem%i==0 )
				{
					isprime=false;
				}
			}
			if(isprime==true )
			{
				System.out.print(rem+" ");
			}
		}
		
	}
}


