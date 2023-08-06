package com.ifelsestatement;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter year:");
		int year=sc.nextInt();
		
		if((year%4==0)&&( year%100!=0))
		{
			System.out.println("Year is leap");
		}
		else
		{
			System.out.println("Year is not leap");
		}
		sc.close();
	}

}
