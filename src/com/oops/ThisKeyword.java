package com.oops;

public class ThisKeyword {
	
	int x=90;
	
	public void show()
	{
		System.out.println(this.x);
		int x=30;
		System.out.println(x);
		
	}
	
	public void show2()
	{
		System.out.println("Hello");
	}
	public void display()
	{
		this.show();
		this.show2();
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		
		ThisKeyword tk=new ThisKeyword();
		tk.display();
	}

}
