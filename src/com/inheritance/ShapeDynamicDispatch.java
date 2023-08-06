package com.inheritance;

class Shape
{
    public void area() 
    {
       System.out.println("Default: 0.0"); 
    }
}

class Circle extends Shape
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public void area()
    {
        System.out.println("Area of circle: "+3.14 * radius * radius);
    }
}

class Rectangle extends Shape 
{
    private double width;
    private double height;

    public Rectangle(double width, double height) 
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public void area()
    {
        System.out.println("Area of Rectangle: "+ width * height);
    }
}


public class ShapeDynamicDispatch 
{

	public static void main(String[] args)
	{
		
		Shape s=new Shape();
		Circle c=new Circle(2.2);
		Rectangle r=new Rectangle(4, 5);
		
		
		
		Shape s1;
		s1=s;
		s1.area();
		
		s1=c;
		s1.area();
		
		s1=r;
		s1.area();
	}

}
