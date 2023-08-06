package com.methodoverriding;

class Mobile
{
	public void show()
	{
		System.out.println("This is mobile");
	}
}

class Basic extends Mobile
{
	public void show()
	{
		System.out.println("This is Basic mobile");
	}	
	
	public void player()
	{
		System.out.println("This is Basic player");
	}
}

class Android extends Mobile
{
	public void show()
	{
		System.out.println("This is Android mobile");
	}
}

public class DynamicPolymorphism {

	public static void main(String[] args) {
		
		Mobile m1=new Mobile();
		m1.show();
		System.out.println("-------------------------------------");
		Mobile m2=new Basic();//dynamic dispatch or upcasting
		m2.show();
		Basic b=new Basic();
		b.player();
		System.out.println("--------------------------------------");
		m2=new Android();
		m2.show();
		
		
			
	}

}
