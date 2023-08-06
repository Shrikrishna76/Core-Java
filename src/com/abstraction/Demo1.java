package com.abstraction;

abstract class mobile
{
	//private String mobileName;
	//private double price;
	
	public abstract void call();
	
	public void display()
	{
		System.out.println("Mobile display Methosd");
	}
}

class Basic extends mobile
{

	@Override
	public void call() {
		System.out.println("Basic mobile calling");
		
	}
	
}

abstract class  Android extends mobile
{
	public abstract void call();
}

class OnePlus extends Android
{

	@Override
	public void call() {
		System.out.println("OnePuls mobile calling");		
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
		
		mobile m=new Basic();
		m.display();
		m.call();
		System.out.println("---------------------------------------");
		Android a=new OnePlus();
		a.display();
		a.call();
	
		

	}

}
