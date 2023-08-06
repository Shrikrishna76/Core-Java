package com.oops;

import java.util.Scanner;


public class Student2 {
	int sid;
	String name;
	float mark1;
	float mark2;
	float mark3;
	double per;
	
	public void access(int id, String n, float m1, float m2, float m3)
	{
		sid=id;
		name=n;
		mark1=m1;
		mark2=m2;
		mark3=m3;
	}
	public void per()
	{
		per=(mark1+mark2+mark3)/3;
			
	}
	
	public void display()
	{
		
		System.out.println("Stusdent Id:"+sid);
		System.out.println("Stusdent Name:"+name);
		System.out.println("Stusdent mark1:"+mark1);
		System.out.println("Stusdent mark2:"+mark2);
		System.out.println("Stusdent mark3:"+mark3);
		System.out.println("Stusdent Percentage:"+per+"");
		if(per>=75)
		{
			System.out.print("Grade A");
		}
		else if(per>=50)
		{
			System.out.print("Grade B");
		}
		else if(per>=25)
		{
			System.out.print("Grade C");
			
		}
		else
		{
			System.out.print("Fail");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Id:");
		int sid=sc.nextInt();
		System.out.print("Enter Name:");
		String name=sc.next();
		System.out.print("Enter mark1:");
		float mark1=sc.nextFloat();
		System.out.print("Enter mark2:");
		float mark2=sc.nextFloat();
		System.out.print("Enter mark3:");
		float mark3=sc.nextFloat();
		
		Student2 s=new Student2();
		s.access(sid,name,mark1,mark2,mark3);
		s.per();
		s.display();
		
		sc.close();
		

	}

}
