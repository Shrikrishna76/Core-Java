package com.methodoverriding;

class Flower
{
	public static void fragrance()
	{
		System.out.println("flower Method");
	}
}

class Rose extends Flower
{
	public static void fragrance()
	{
		System.out.println("Rose method");
	}
}

public class Dynamic2 {

	public static void main(String[] args) {
		
		Flower r=new Rose();
		r.fragrance();//method hiding

	}

}
