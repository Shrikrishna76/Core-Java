package com.exams;
/*
 * Write a program to demonstrate use of 'this' keyword.
 */

class Person {
   
    String name;
    int age;

    
    public Person(String name, int age) {
        
        this.name = name;
        this.age = age;
    }

   
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


public class ThisKeyword {

	public static void main(String[] args) {
		Person p=new Person("karan",22);
		p.displayInfo();
		

	}

}
