package com.switchcase;

import java.util.Scanner;

public class Ternary4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		String str=n%2==0 ? "Even ": "odd";
		System.out.println(str);
		sc.close();

	}

}
