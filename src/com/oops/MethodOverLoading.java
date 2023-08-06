package com.oops;



public class MethodOverLoading {
	public void area(float pi, int r)
	{
		System.out.println("Area of Circle:"+(pi*r*r));
	}
	
	public void area(int l, int w)
	{
		System.out.println("Area of Rectangle:"+(l*w));
	}
	
	public void area(int b, float h)
	{
		System.out.println("Area of triangle:"+(1/2*b*h));
	}
	public void area(int s)
	{
		System.out.println("Area of square:"+(s*s));
	}

	public static void main(String[] args) {
		
		MethodOverLoading m=new MethodOverLoading();
		
		m.area(3.14f,4);
		m.area(5, 8);
		m.area(4, 4);
		m.area(5);
		
		

	}
}
