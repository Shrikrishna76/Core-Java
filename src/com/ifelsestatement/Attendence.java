package com.ifelsestatement;

import java.util.Scanner;

public class Attendence {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Number of classes held:");
		int c=sc.nextInt();
		
		System.out.print("Enter Number of classes attended:");
		int a=sc.nextInt();
		
		int per=a*100/c;
		System.out.println("student attendence percentage:"+per);
	    
		if(per>=75)
		{
			System.out.println("Student is allowed to sit in exam");
			
		}
		else
		{
			System.out.print("Student is not allowed to sit in exam");
		}
		sc.close();
	}

}
