package com.methodoverriding;

class Student
{
	protected String name;
	protected int age;
	protected String email;
	protected String contact;
	
	public Student(String name, int age, String email,String contact)
	{
		this.name=name;
		this.age=age;
		this.email=email;
		this.contact=contact;
	}
	
	public void show()
	{
		System.out.println("Name:  \t"     +name);
		System.out.println("Age:  \t"      +age);
		System.out.println("Email: \t"    +email);
		System.out.println("Contact:"  +contact);
	}
}

class Teacher extends Student
{
	protected double salary;
	protected String degree;
	
	public Teacher(String name, int age, String email,String contact,double salary,String degree)
	{
		super(name,age,email,contact);
		this.salary=salary;
		this.degree=degree;
	}
	
	public void show()
	{
		super.show();
		System.out.println("salary:\t"    +salary);
		System.out.println("degree:\t"    +degree);
	}
}

public class TextOverride {

	public static void main(String[] args) {
		
		Teacher t=new Teacher("karan", 25, "karan@gmail.com", "1234567892", 25000.00, "BA");
		t.show();
		
	}

}
