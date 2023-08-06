package com.whileloop;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter  number:");
		int num=sc.nextInt();
		
		int max=Integer.MIN_VALUE;
		int min =Integer.MAX_VALUE;
		
		 
		while(num>0)
		{
			 int rem=num%10;
			
			if(max<rem)
			{
				max=rem;
				
			}
			if(rem<min)
			{
				min=rem;
			}
			num/=10;
			
		}
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		sc.close();
	}

}
