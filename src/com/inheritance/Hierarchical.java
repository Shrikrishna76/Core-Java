package com.inheritance;

class Bike
{
	public void show()
	{
		System.out.println("There are many  of bike");
	}
}

class Honda extends Bike
{
	public void show1()
	{
		System.out.println("Honda is one of them");
	}
}

class Splender extends Bike
{
	public void show2()
	{
		System.out.println("Splender is one of them:");
	}
}

class Shine extends Bike
{
	public void show3()
	{
		System.out.println("Shine one of them");
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		
		Splender s=new Splender();
		Honda h=new Honda();
		Shine sh=new Shine();
		s.show();
		h.show1();
		s.show2();
		sh.show3();
		
		
	}

}
