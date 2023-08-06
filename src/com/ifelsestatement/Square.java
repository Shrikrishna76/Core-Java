package com.ifelsestatement;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.print("enter length:");
		int l=sc.nextInt();
		
		System.out.print("enter breadth:");
		int b=sc.nextInt();
		
		if(l==b)
		{
			System.out.println("It is a square");
		}
		else
		{
			System.out.println("It is not square");
		}
		sc.close();
		
	}

}
