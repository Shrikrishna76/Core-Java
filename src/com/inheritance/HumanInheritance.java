package com.inheritance;

class Human
{
	protected String name;
	protected String gender;
	
	public Human(String name,String gender)
	{
		this.name=name;
		this.gender=gender;
	}
	
	public static void find(Woman w, Man m)
	{
		if(w.age>m.age)
		{
			System.out.println("Woman age is grater");
		}
		else if(w.age<m.age)
		{
			System.out.println("Man age is Grater");
		}
		else
		{
			System.out.println("Age of both is same");
		}
			
		
	}
}

class Woman extends Human
{
	protected int age;
	public Woman(String name, String gender, int age)
	{
		super(name,gender);
		this.age=age;
	}
}

class Man extends Human
{
	protected int age;
	public Man(String name, String gender, int age)
	{
		super(name,gender);
		this.age=age;
	}
}

public class HumanInheritance {

	public static void main(String[] args) {
		
		Woman w=new Woman("shital", "Femal", 24);
		Man m=new Man("Mauli", "Male", 19);
		Human.find(w,m);
		
	}

}
