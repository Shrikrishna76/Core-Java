package com.methodoverriding;
 
class Cal
 {
	public void add(int a,float b)
	{
		System.out.println(a+" "+b);
	}
	public void add(float a,int b)
	{
		System.out.println(a+" "+b);
	}
 }

public class Test1 
{
	public static void main(String args[])
	{
		Cal c=new Cal();
		c.add(2.2f, 3);
		c.add(12, 2.6f);
	}
	
}
