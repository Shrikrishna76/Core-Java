package com.forloop;
//Write a Java program to find sum of all even numbers between 1 to n. 
import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		int sum=0;
		
		int i;
		
		for( i=1; i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
				
			}
			sc.close();
		}
		
		System.out.print("The sum of even number is:"+sum);
		
	}

}
