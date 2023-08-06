package com.interfaceprogram;

interface Calculator
{
	public int add(int a, int b);
	public int sub(int a, int b);
	public int mul(int a, int b);
	public int div(int a, int b);
	
	private void data()
	{
		System.out.println("Method interface private");
	}
	
	static void shareDada()
	{
		System.out.println("Static method in interface");
	}
	
	private static void showdata()
	{
		System.out.println("Private static method");
	}
	
	default void display()
	{
		data();
		showdata();
		System.out.println("Fecebook");
	}
	
	default void m1()
	{
		System.out.println("amzon");
	}
}

class BasicCal implements Calculator
{

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		
		return a/b;
	}
	
}

public class TestCalculator {

	public static void main(String[] args) {
		BasicCal b=new BasicCal();
		System.out.println("Add: "+b.add(12, 3));
		System.out.println("Sub: "+b.sub(12, 3));
		System.out.println("Mul: "+b.mul(12, 3));
		System.out.println("Div: "+b.div(12, 3));
		b.display();
		Calculator.shareDada();

	}

}
