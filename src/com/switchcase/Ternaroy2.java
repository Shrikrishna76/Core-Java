package com.switchcase;

import java.util.Scanner;

public class Ternaroy2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		String str=n%5==0 ? "Divisible ": "Not Divisible";
		System.out.println(str);
		sc.close();
	}

}
