package com.exams;
/*
 * Write a Java program to explain “multilevel inheritance.
 */

class Animal 
{
   public void eat() 
    {
        System.out.println("Animal is eating.");
    }
}


class Mammal extends Animal {
	public void walk()
	{
        System.out.println("Mammal is walking.");
    }
}


class Dog extends Mammal
{
    public void bark() 
    {
        System.out.println("Dog is barking.");
    }
}



public class MultilevelInheritance {

	public static void main(String[] args) {
		 Dog d = new Dog();

		 d.eat(); 
	     d.walk(); 
	     d.bark(); 
	}

}
