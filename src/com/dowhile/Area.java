package com.dowhile;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		char ch='y';
		do {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Area of Reactangle \n2.Area of Square \n3.Area of Circle \n4. Area of Triangle");
		System.out.println("Enter the choice:");
		int choice=sc.nextInt();
		
		switch(choice)
			{
			case 1:
				System.out.print("Enter length:");
				int l=sc.nextInt();
				
				System.out.print("Enter width:");
				int w=sc.nextInt();
				
				System.out.println("Area of Reactangle:"+(l*w));
			break;
		
			case 2:
				System.out.print("Enter side:");
				int s=sc.nextInt();
				
				System.out.println("Area of Square:"+(s*s));
			break;
		
			case 3:
				System.out.print("Enter Radius:");
				int r=sc.nextInt();
				
				System.out.println("Area of circle:"+(3.14*(r*r)));
			break;
		
			case 4:
				System.out.print("Enter base:");
				int b=sc.nextInt();
				
				System.out.print("Enter height:");
				int h=sc.nextInt();
				
				System.out.println("Area of triangle:"+(0.5*b*h));
			break;
		
			default :
				System.out.println("Invalid Choice");
			break;
		
			}
			System.out.println("You want to continue(y/n):");
			 ch=sc.next().charAt(0);
			 sc.close();
		 }
		 while(ch=='y'||ch=='Y');
		 
		
	}

}
