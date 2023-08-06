package com.oops;



public class Bike {
	String name;
	int speed;
	String color;
	int number;
	
	Bike()
	{
		this("Tvs",120,"Black", 1234);
	}
	
	Bike (String name, int speed, String color, int number)
	{
		this.name=name;
		this.speed=speed;
		this.color=color;
		this.number=number;
	}
	
	

	public static void main(String[] args) {
		
		Bike b=new Bike();
		System.out.println("Bike Name: "+b.name);
		System.out.println("Bike Speed: "+b.speed);
		System.out.println("Bike Color: "+b.color);
		System.out.println("Bike Number: "+b.number);
		
	}
}
