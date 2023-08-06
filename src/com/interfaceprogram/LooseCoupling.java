package com.interfaceprogram;

interface Vehicle 
{
	void move();
}

class Car implements Vehicle
{
	public void move()
	{
		System.out.println("Traveling by car");
	}
}

class Bus implements Vehicle
{
	public void move()
	{
		System.out.println("Travelling by bus");
	}
}

class Bike implements Vehicle
{
	public void move()
	{
		System.out.println("Travling by bike");
	}
}

class Traveler
{
	private Vehicle v;
	
	public Vehicle getV()
	{
		return v;
	}
	
	public void setV(Vehicle v)
	{
		this.v=v;
	}
	
	public void startJourney()
	{
		v.move();
	}
}

public class LooseCoupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Traveler t1=new Traveler();
		t1.setV(new Car());
		t1.startJourney();
		
		t1.setV(new Bike());
		t1.startJourney();
		

	}

}
