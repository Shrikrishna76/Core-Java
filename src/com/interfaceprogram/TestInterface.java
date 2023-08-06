package com.interfaceprogram;
/*
 * 2.	Write a program to create interface named test. In this interface the member function is square. 
 * Implement this interface in arithmetic class. Create one new class called ToTestInt in this class use
 *  the object of arithmetic class.
 */

interface Test 
{
    int square(int num);
}

class Arithmetic implements Test
{
    @Override
    public int square(int num) 
    {
        return num * num;
    }
}

public class TestInterface 
{

	public static void main(String[] args) 
	{
		 Arithmetic a = new Arithmetic();

	        // Testing the square method from the Arithmetic class
	        int number = 5;
	        int result = a.square(number);
	        System.out.println("Square of " + number + " is: " + result);
		
	}

}
