package com.oops;


public class Student {

	
	int sid;
	String name;
	int std;
	double per;
	
	public void acceptdetails(int id, String n, int stand, double perce)
	{
		sid=id;
		name=n;
		std=stand;
		per=perce;
	}
	
	public void display()
	{
		System.out.println("Student Id:"+sid+"  Student name:"+name+"  standard:"+std+"  Student Percentage:"+per);
	}
	
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.acceptdetails(1, "Karan", 9, 74.99);
		s1.display();
		
		Student s2=new Student();
		s2.acceptdetails(2, "Irfan", 9, 77.99);
		s2.display();
		

	}


}
