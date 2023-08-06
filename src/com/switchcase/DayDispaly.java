package com.switchcase;

import java.util.Scanner;

public class DayDispaly {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
		System.out.print("Enter day number:");
		int day=sc.nextInt();
		
		switch(day)
		{
		case 1:
			System.out.print("sunday");
		break;
		
		case 2:
			System.out.print("monday");
		break;
		
		case 3:
			System.out.print("Tuesday");
		break;
		
		case 4:
			System.out.print("wednesday");
		break;
		
		case 5:
			System.out.print("thursday");
		break;
		
		case 6:
			System.out.print("friday");
		break;
		
		case 7:
			System.out.print("saturday");
		break;
		
		default :
			System.out.print("Invalid day");
		}
		sc.close();
	}

}
