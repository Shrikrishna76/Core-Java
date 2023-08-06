package com.exams;
/*
 * Write a program to demonstrate use of 'static' keyword.
 */

class StaticDemo {
    // Static variable
    static int staticVar = 10;

    // Non-static (instance) variable
    int instanceVar=20;

    // Static method
    static void staticMethod()
    {
        System.out.println("This is a static method.");
    }

    // Non-static (instance) method
    void instanceMethod() 
    {
        System.out.println("This is an instance method.");
    }
}



public class Statickeyword {

	public static void main(String[] args) {
		
			StaticDemo sd=new StaticDemo();
	        System.out.println("Static variable value: " + sd.staticVar);
	        sd.staticMethod();
	        
	        System.out.println("Instance Variable value: "+sd.instanceVar);
	        sd.instanceMethod();
	        
	}

}
