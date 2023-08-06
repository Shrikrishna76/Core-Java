package com.abstraction;

abstract class Animal
{
	public String name;
	public Animal(String name)
	{
		this.name=name;
	}
	public abstract void makesound();
	
	public void eat()
	{
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal
{
	public Dog(String name)
	{
		super(name);
	}
	public void makesound()
	{
		System.out.println(name+" barks");
	}
}

class Cat extends Animal
{
	public Cat(String name)
	{
		super(name);
	}
	public void makesound()
	{
		System.out.println(name+" meows");
	}
}



public class Demo {

	public static void main(String[] args) {
		
		Animal a=new Dog("Tuffy");
		a.eat();
		a.makesound();
		System.out.println("-----------------------------------------------------");
		a=new Cat("Luna");
		a.eat();
		a.makesound();
		

	}

}
