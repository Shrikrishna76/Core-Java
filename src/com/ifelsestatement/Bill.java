package com.ifelsestatement;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to PVR multiplex");
		
		System.out.print("Enter the name:");
		
		String name=sc.next();
		
		System.out.print("Enter the movie name:");
		String movie=sc.next();
		
		System.out.println("Enter movie ticket price:");
		int price=sc.nextInt();
		
		System.out.print("Enter the cupon code:");
		int cupon=sc.nextInt();
		
		if(cupon==100)
		{
			System.out.println("you get 10% discount");
			double t_price=price-(0.10*price);
			System.out.println("Your bill is:"+t_price);
			
		}
		else if(cupon==200)
		{
			System.out.println("you get 20% discount");
			double bill=price-(0.20*price);
			System.out.println("Your bill is:"+bill);
			
			
		}
		else
		{
			System.out.println("You not get discount");
		}
		
		
	
	System.out.print("Enter the no of pizzas:");
	int c=sc.nextInt();
	
	System.out.print("Enter the no of puffs bought:");
	int a=sc.nextInt();
	
	
	System.out.println("Enter the no of cool drinks bought:");
	int b=sc.nextInt();
	
	int pb=100*c;
	int puffb=20*a;
	int cb=10*b;
	
	System.out.print("Your name:"+name);
	System.out.print("Your  movie name:"+movie);
	System.out.println("bill of pizza:"+pb);
	System.out.println("bill  of puffs:"+puffb);
	System.out.println("bill of cool drinks bought:"+cb);
	
	int total=pb+puffb+cb;
	System.out.println("total bill:"+total);
	
	
	sc.close();
	}

}
