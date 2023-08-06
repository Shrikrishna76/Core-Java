package com.whileloop;

import java.util.Scanner;

public class Tabel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number to print the Tabel:");
		int num=sc.nextInt();
		int i=1;
		int s ;
		while(i<=10)
		{
			s=num*i;
			System.out.println(s);
			i++;
		}
		sc.close();
		
		
	}

}
