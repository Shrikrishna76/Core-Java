package com.basics;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enetr base:");
		int base=sc.nextInt();
		
		System.out.print("Enetr exponent:");
		int exponent=sc.nextInt();
		
		double power=Math.pow(base, exponent);
		System.out.println("Enterd number power is:"+power);
		sc.close();
	}

}
