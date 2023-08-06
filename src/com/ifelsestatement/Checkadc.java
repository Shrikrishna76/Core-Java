package com.ifelsestatement;

import java.util.Scanner;

public class Checkadc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Character:");
		char ch=sc.next().charAt(0);
	
		
		if(ch>='0'&& ch<='9')
		{
			System.out.println("It is a number");
		}
		else if (ch>='A' && ch<='Z' || ch>='a' && ch<='z')
		{
			System.out.println("It is a Alphabet");
		}
		else
		{
			System.out.println("It is a special character");
		}
		sc.close();
	}

}
