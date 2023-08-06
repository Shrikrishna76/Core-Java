package com.inheritance;

class Student1
{
	String name="karan shinde";
	public void show1()
	{
		System.out.println("Student Full Name:"+name);
	}
}

class Marks extends Student1
{
	int math=87;
	int scien=90;
	public void show()
	{
		System.out.println(name+" get the mark in math "+math);
		System.out.println(name+" get the mark in science "+scien );
	}
}

public class Single {

	public static void main(String[] args) {
		Marks m=new Marks();
		m.show1();
		m.show();
		
		

	}

}
