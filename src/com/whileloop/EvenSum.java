package com.whileloop;
//write code to find out the sum of even digit from the number
import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		int sum=0;
		
		int digit=0;
		
		
		while(num!=0)
		{
			digit=num%10;
			
			if(digit%2==0)
			{
				
				sum=sum+digit;
				
				
			}
			num=num/10;
			
			
			
		}
		System.out.println("Sum is :"+sum);
		sc.close();
		
	}

}
