package com.oops;



public class Building {
	int flat_No;
	int num_of_People;
	static String b_name;
	
	public static String accept(String b_Name)
	{
		b_name=b_Name;
		return b_Name;
	}

	public void acceptNonStatic(int flat_No,int num_of_People)
	{
		this.flat_No=flat_No;
		this.num_of_People=num_of_People;
	}
	
	public static void display()
	{
		String b_Name=accept("Shivneri");
		Building b=new Building();
		
		b.acceptNonStatic(55, 100);
		System.out.print(b.flat_No+" "+b.num_of_People+" "+b.b_name);
	}
	public static void main(String[] args) {
		
		display();
		
	}


}
