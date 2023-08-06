package com.methodoverriding;

class Parent
{
	int s=10;
	public Parent()
	{
		
		System.out.println("This is Parent   Constructor");
	}
	
	public Parent(int s)
	{
		this();
		System.out.println("Variabel:"+this.s);
		System.out.println("This is constructor second");
		System.out.println("This is constructor second variabel:"+s);
		
	}
	
	public void parentmethod()
	{
		
		System.out.println("This is parent  method");
	}
	
	public void parentmethod2()
	{
		this.parentmethod();
		System.out.println("This is parent method 2");
		
	}
}

class Child extends Parent
{  
	public  Child()
	{
		super();
		
		System.out.println("parent variabel:"+super.s);
		System.out.println("This is Show class method");
	}
	
	public void dis()
	{	
		super.parentmethod2();
		System.out.println("This is Show class dis method");
	}
}

public class ThisSuperDemo {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.dis();
		Parent p=new Parent(12);
		
	}

}
