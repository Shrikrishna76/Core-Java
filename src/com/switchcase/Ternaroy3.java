package com.switchcase;

import java.util.Scanner;

public class Ternaroy3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		int result = a > b ? a > c ? a : b : b > c ? b: c;
		System.out.println("Gratest number is:"+result);
		sc.close();
	}

}
