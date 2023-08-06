package com.switchcase;

import java.util.Scanner;

public class TernoryOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		String str=n>0?n==0?"Zero":"Positive":n<0?"Negative":"Zero";
		System.out.print(str);
		sc.close();

	}

}
