package com.oops;

import java.util.Scanner;

public class MilkOil {
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		int oil=0;
		int milk=0;
		int sum=0;
		int o=0;
		int m=0;
		while(sum<500)
		{
			System.out.print("Enter quantity of oil :");
			oil=sc.nextInt();
			o=o+oil;
			System.out.print("Enter quantity of milk:" );
			milk=sc.nextInt();
			m=m+milk;
			sum=(sum+(oil*50+milk*40));
		}
		System.out.println("quntity of oil:"+o);
		System.out.println("quntity of milk:"+ m);
		System.out.println(sum);
		sc.close();
	}
	

}
