package com.switchcase;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a>b?1 :0;
		
		switch(c)
		{
		case 1:
			
			System.out.print(a+" is grater than "+b);
			break;
		case 0:
			System.out.print(a+" less than"+b);
			break;
		}
		sc.close();

	}

}
