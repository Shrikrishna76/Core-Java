package com.khadija_mam_assignment;

/*
 Write java Program for arithmetic operation for each operation write
 separate Method using parameter passing and return type.
 */

import java.util.Scanner;

public class ArithmeticOperation {

	public static int add(int num1, int num2)
	{
        return num1 + num2;
    }
    
    public static  int subtract(int num1, int num2)
    {
        return num1 - num2;
    }
    
    public static int multiply(int num1, int num2) 
    {
        return num1 * num2;
    }
    
    public static  double divide(int num1, int num2)
    {
        if (num2 == 0) 
        {
            System.out.println("Error: Division by zero!");
            return 0;
        } 
        
        else 
        {
            return (double) num1 / num2;
        }
    }
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		int num1=sc.nextInt();
		System.out.print("Enter Second Number:");
		int num2=sc.nextInt();        
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
	
		sc.close();	}

}
