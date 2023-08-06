package com.inheritance;

import java.util.Scanner;

/*
 * 1.Declare a class ‘Student’ with data members ‘name’, ‘roll number’ and ‘marks’. Also declare a class ‘MyRecord’ which 
 * inherited from class ‘Student’.Display name, roll number and percentage by creating the object of class MyRecord
 */

class Studentinfo
{
    String name;
    int rollNumber;
    double marks;

    
    public Studentinfo(String name, int rollNumber, double marks)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
}

class MyRecord extends Studentinfo
{
    
    public MyRecord(String name, int rollNumber, double marks)
    {
        super(name, rollNumber, marks);
    }

    
    public void displayPercentage() 
    {
        double percentage = (marks / 500.0) * 100;
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Percentage: " + percentage + "%");
    }
}


public class StudentInheritance
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.next();
		System.out.println("Enter Roll  Number:");
		int rollnumber=sc.nextInt();
		System.out.println("Enter Mark:");
		double mark=sc.nextDouble();
		 MyRecord myRecord = new MyRecord(name, rollnumber, mark);

	        
	        myRecord.displayPercentage();

	}

}
