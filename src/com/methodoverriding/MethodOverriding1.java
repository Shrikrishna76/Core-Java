package com.methodoverriding;

//class Bike
//{
//	public void show()
//	{
//		System.out.println("This is Bike Class");
//	}
//}
//
//class Honda extends Bike
//{
//	public void show()
//	{
//		System.out.println("This is Honda Class");
//	}
//}

class Bike1
{
	protected void show()
	{
		System.out.println("This is Bike Class");
	}
}

class Honda extends Bike1
{
	public void show()
	{
		System.out.println("This is Honda Class");
	}
}

public class MethodOverriding1 {

	public static void main(String[] args) {
		Honda h=new Honda();
		h.show();
		
		Bike1 b=new Bike1();
		b.show();
		
//		Bike b1=new Bike();
//		b1.show1();

	}

}
