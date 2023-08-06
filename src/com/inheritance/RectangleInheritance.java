package com.inheritance;

class Rectangle14
{
	protected int length;
	protected int width;
	
	public Rectangle14(int length, int width)
	{
		this.length=length;
		this.width=width;
	}
	
	public void area()
	{
		int area=length*width;
		System.out.println("Area of Rectangle:"+area);
	}
}

class Box extends Rectangle
{
	protected int depth;
	
	public Box(int length, int width, int depth)
	{
		super(length,width);
		this.depth=depth;
	}
	
	public void display()
	{
		System.out.println("Depth:"+depth);
	}
}

public class RectangleInheritance {

	public static void main(String[] args) {
		Box b=new Box(4, 5, 6);
		b.area();
		b.display();
		

	}

}
