package com.oops;


class Os
{
	public void show()
	{
		System.out.println("Os system");
	}
	
	public final void  display()//Can not overriden final method
	{
		System.out.println("Dispaly Os ");
	}
}

class Windows extends Os
{
	public void show()
	{
		System.out.println("Windows Os");
	}
	
	//public final void display()    Can not override final method
	{
		System.out.println("Display Windows");
	}
}







final class Test
{
	public void show1()
	{
		System.out.println("Hello");
	}
	


//class Test2 extends Test	//final class not override
{
	
}

}



public class FinalTest {
	
	final int a;//initialize here or in constructor is must 
	final int c=66;
	
	public FinalTest()
	{
		a=12;
	}
	
	static final int d=90;
	static final int e;
	static
	{
		e=88;
	}
//	static
//	{
//		e=33;// can not inisilize
//	}

	public FinalTest(String str)
	{
		a=123;
	}
	
	public FinalTest(int z)
	{
		a=99;
	}
	
	
	
	public static void main(String[] args) {
		
		final int b;
		b=10;
		//b++; not change value
		System.out.println(b);
		                                                                              
		
		FinalTest f=new FinalTest();
		System.out.println(f.a);

	}

}
