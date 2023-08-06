package com.whileloop;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		
		int sqr=num*num;
		int onum=num;
		
		int count=0;
		while(onum>0)
		{
			onum/=10;
			count++;
			
		}
		int ldigit=(int)(sqr%Math.pow(10,count));
		
		if(ldigit==num)
		{
			System.out.print(num+" is an automorphic number");
		}
		else
		{
			System.out.print(num+" is an not automorphic number");
		}
		sc.close();
	}

}
