package com.interfaceprogram;
/*
 * 1.Write a program to create a interface  named shape. In this class we have 
 * three sub classes circle, triangle and square each class has two member function named draw () and erase ().
 *  Create these using polymorphism concepts.
 */

interface Shape
{
    void draw();
    void erase();
}


class Circle implements Shape 
{
    @Override
    public void draw()
    {
        System.out.println("Drawing a circle");
    }

    @Override
    public void erase()
    {
        System.out.println("Erasing a circle");
    }
}


class Triangle implements Shape
{
    @Override
    public void draw() 
    {
        System.out.println("Drawing a triangle");
    }

    @Override
    public void erase()
    {
        System.out.println("Erasing a triangle");
    }
}


class Square implements Shape
{
    @Override
    public void draw() 
    {
        System.out.println("Drawing a square");
    }

    @Override
    public void erase()
    {
        System.out.println("Erasing a square");
    }
}




public class ShapeInterface 
{

	public static void main(String[] args)
	{
		Circle c=new Circle();
		c.draw();
		c.erase();
	
		Triangle t=new Triangle();
		t.draw();
		t.erase();
		
		Square s=new Square();
		s.draw();
		s.erase();
	}

}
