package com.inheritance;

class Values
{
	int len=23;
	int bre=12;
}

class Rectangle1 extends Values
{
	public void show()
	{
		System.out.println("Area of Rectangle:"+(len*bre));
	}
}

class Square extends Values
{
	public void show1()
	{
		System.out.println("Area of Square:"+(len*len));
	}
	
}

public class Hierarchical1 {

	public static void main(String[] args) {
		
		Rectangle1 r=new Rectangle1();
		r.show();
		Square s=new Square();
		s.show1();
		

	}

}
