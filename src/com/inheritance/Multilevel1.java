package com.inheritance;

class Standard
{
	public void show()
	{
		System.out.println("10th Standard");
	}
}

class Students extends Standard
{
	public void show1()
	{
		System.out.println("There are 50 students in class");
	}
}

class StudentName extends Students
{
	public void show2()
	{
		System.out.print("Karan Nandre is one of them");
	}
}

public class Multilevel1 {

	public static void main(String[] args) {
		
		StudentName sn=new StudentName();
		sn.show();
		sn.show1();
		sn.show2();
		

	}

}
