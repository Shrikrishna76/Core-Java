package com.methodoverriding;

class Calculator
{
	public Object add()
	{
		return 12;
	}
}

class SimpleCalculator extends Calculator
{
	public String add()
	{
		return "Hello";
	}
}

public class MethodOverriding4 {

	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		c.add();
		SimpleCalculator s=new SimpleCalculator();
		s.add();		

	}

}
