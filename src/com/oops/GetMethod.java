package com.oops;
/*
 * Create getId() method in Student class. call getId() method
from displayData method so that you know that one
method can be called from another method. Return id
from getId() method and set that id to the instance
variable in displayData method.
 */


public class GetMethod {
	
	     int id=5;

	    public int getId() {
	        return id;
	    }

	    public void displayData() {
	        id = getId(); 
	        System.out.println("Student ID: " + id);
	    }

	    public static void main(String[] args) {
	        GetMethod gm = new GetMethod();
	        gm.displayData();
	    }
	}

