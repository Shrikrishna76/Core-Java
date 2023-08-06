package com.khadija_mam_assignment;

public class Student {
	
	String name;
	private int rollNo;
	protected int admissionNo;
	public int age;
	
	 void doDefault(String name)
	{
		System.out.println("Student Name: "+name);
	}
	
	private void doPrivate(int rollNo)
	{
		System.out.println("Student Roll No: "+rollNo);
	}
	
	protected void doProtected(int admissionNo)
	{
		System.out.println("Student Admission No: "+admissionNo);
	}
	public void doPublic(int age)
	{
		System.out.println("Student Age: "+age);
	}
	
	public static void main(String args[])
	{
		Student s=new Student();
		s.doDefault("sss");
		s.doPrivate(11);
		s.doProtected(12);
		s.doPublic(19);
				
	}
	

}
