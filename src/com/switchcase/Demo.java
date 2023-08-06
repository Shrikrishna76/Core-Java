package com.switchcase;
////Write a program to read gender(M/F) and print the corresponding gender using a switch statement

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Gender(M/F):");
		char g=sc.next().charAt(0);
		switch(g)
		{
		case 'm':
			System.out.print("Male");
		break;
		
		case 'f':
			System.out.print("Female");
		break;
		}
		sc.close();
		
		
	}

}
