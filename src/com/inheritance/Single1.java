package com.inheritance;

class Area
{
	int circle;
	
	
	public void show1()
	{
		System.out.println("Find Area of Circle");
		
	}
}

class Circle9 extends Area
{
	double r=6;
	double a=3.14*r*r;
	
	public void show()
	{
		System.out.println("Area of Circle:"+a+" ");
	}
}

public class Single1 {

	public static void main(String[] args) {
		Circle9 c=new Circle9();
		c.show1();
		c.show();

	}

}
