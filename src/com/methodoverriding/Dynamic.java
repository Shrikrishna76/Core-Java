package com.methodoverriding;

class Fruit
{
	public void color()
	{
		System.out.println("color is ");
	}
}

class Apple extends Fruit
{
	public void color()
	{
		System.out.println("Apple is Red");
		
	}
}

class Banana extends Fruit
{
	public void color()
	{
		System.out.println("Banana is yellow");
	}
}

public class Dynamic {

	public static void main(String[] args) {
		
		Fruit f=new Fruit();
		Apple a=new Apple();
		Banana b=new Banana();
		
		Fruit f1;
		f1=f;
		
		f1.color();
		
		f1=a;
		f1.color();
		
		f1=b;
		f1.color();

	}

}
