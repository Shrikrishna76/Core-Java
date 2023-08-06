package com.switchcase;

import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number between 1 to 5:");
		int num=sc.nextInt();
		switch(num)
		{
		case 1:
			System.out.print("one");
			break;
		case 2:
			System.out.print("Two");
			break;
		case 3:
			System.out.print("Three");
			break;
		case 4:
			System.out.print("Four");
			break;
		case 5:
			System.out.print("Five");
			break;
			default:
				System.out.print("Invalid");

		}
		sc.close();
	}

}
