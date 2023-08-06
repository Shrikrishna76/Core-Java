package com.whileloop;
//write a code to check prime or not.
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		int count=0;
		int i=2;
		while(i<n/2)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
			i++;
		}
		if(count==0)
		{
			System.out.print("prime");
		}
		else
		{
			System.out.print("not prime");
		}
		sc.close();
	}

}
