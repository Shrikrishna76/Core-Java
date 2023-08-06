package com.inheritance;


class Superkey
{
	int ms=10;
	public Superkey()
	{
		
		System.out.println("Default Constructor");
	}
	
	public void m1()
	{
		
		System.out.println("This is m1 method");
	}
}

public class SuperKeyword extends Superkey
{
	
	public SuperKeyword()
	{
		super();
		System.out.println("SuperKeyword constructor");
	}
	
	public void m2()
	{
		super.m1();
		System.out.println("This is m2 method");
	}
	
	public static void main(String[] args) {
		
		SuperKeyword a=new SuperKeyword();

		a.m2();
		
	}

}


