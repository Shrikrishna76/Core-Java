package com.switchcase;

import java.util.Scanner;

public class DaysMonth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter month:");
		int m=sc.nextInt();
		switch(m)
		{
		case 1:
			System.out.print("Number of days is 31");
			break;
		case 2:
			System.out.print("Number of days is 28");
			break;
		case 3:
			System.out.print("Number of days is 31");
			break;
		case 4:
			System.out.print("Number of days is 30");
			break;
		case 5:
			System.out.print("Number of days is 31");
			break;
		case 6:
			System.out.print("Number of days is 30");
			break;
		case 7:
			System.out.print("Number of days is 31");
			break;
		case 8:
			System.out.print("Number of days is 31");
			break;
		case 9:
			System.out.print("Number of days is 30");
			break;
		case 10:
			System.out.print("Number of days is 31");
			break;
		case 11:
			System.out.print("Number of days is 30");
			break;
		case 12:
			System.out.print("Number of days is 31");
			break;
		default:
			System.out.print("Enter valid month");
			
		}
		sc.close();
		
	}

}
