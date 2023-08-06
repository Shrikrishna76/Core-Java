package com.methodoverriding;
/*
 * WAP to create a class Kid with method readBook() and another method readBook () with 2
parameters. The method readBook here is over-loaded (same method name but different
parameters) Create a class BigKid which extends Kid created above. Implement readBook() differently in
BigKid class. Here the method readBook() has been over-ridden in the child class BigKid()

 */

class Kid
{
	public void readBook()
	{
		System.out.println("Here Kid readbook");
	}
	
	public void readBook(int price, String name)
	{
		System.out.println("Price: "+price+" Name: "+name);
	}
}

class BigKid extends Kid
{
	public void readBook()
	{
		System.out.println("Here is the Big kid read Book");
	}
}

public class MethodOverrideKid {

	public static void main(String[] args) {
		
		Kid k=new Kid();
		k.readBook();
		k.readBook(200, "Java");
		
		BigKid b=new BigKid();
		b.readBook();

	}

}
