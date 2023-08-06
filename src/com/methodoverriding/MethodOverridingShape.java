package com.methodoverriding;
/*
 * WAP to create class shape with method draw().create class circle, square, Rectangle which extends Shape implement draw()
 *  differently in each child.
 */

 class Shape 
 {
    public  void draw()
    {
    	System.out.print("Shape");
    }

	
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}



public class MethodOverridingShape {

	public static void main(String[] args) {
		Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();
	}

}
