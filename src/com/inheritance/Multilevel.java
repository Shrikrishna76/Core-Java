package com.inheritance;

class Human1
{
	public void show()
	{
		System.out.println("you are a Human");
	}
}

class Engineer extends Human1
{
	public void show1()
	{
		System.out.println("you are a Engineer");

	}
}

class Student extends Engineer
{
	public void show2()
	{
	System.out.println("you are a Student");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.show();
		s.show1();
		s.show2();
		

	}

}
