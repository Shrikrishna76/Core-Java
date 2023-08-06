package com.methodoverriding;

class Shape13
{
	public double show()
	{
		System.out.println("This is parent class");
		return 12.33;
	}
}

class Circle13 extends Shape13
{
	public double show3()
	{
		System.out.println("This is child class");
		return 25.00;
	}
}

public class MethodOverriding2 {

	public static void main(String[] args) {
		Shape13 s=new Shape13();
		s.show();
		
		Circle13 c=new Circle13();
		c.show3();
		
		Circle13 s1=new Circle13();
		s1.show3();
		

	}

}
