package com.oops;
/*
 * Write a program for class and object : (initialization through method)
Note : Initializing object simply means storing data into object
 */
public class ClassObject {
	String name;
    int age;

    void initialize(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    
    public static void main(String[] args) {
        
        ClassObject co= new ClassObject();

       
        co.initialize("karan", 20);

        
        co.displayDetails();
    }
}
