package com.inheritance;



class Base
{
	int a;
	int b;
	
	public Base(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void setA(int a)
	{
		this.a=a;
	}
	
	public void setB(int b)
	{
		this.b=b;
	}
	
	public int getA()
	{
		return a;
	}
	
	public int getB()
	{
		return b;
	}
}

class Derived extends Base
{
	public Derived(int a,int b)
	{
		super( a, b);
	}
	public void dispMax()
	{
		if(a>b)
		{
			System.out.println(a+" is maximum");
		}
	}
	
	public void dispMin()
	{
		if(a>b)
		{
			System.out.println(b+" is minimum");
		}
	}
	
	
}

public class InheritanceBase 
{

	public static void main(String[] args)
	{
		
		Derived d=new Derived(8,3);
		
		d.dispMax();
		d.dispMin();
		
		

	}

}
