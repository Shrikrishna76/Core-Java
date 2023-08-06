package com.oops;



public class ConstructorOverLoading {
	
	public ConstructorOverLoading(int a, int b)
	{
		int c;
		System.out.println("Before swapping:"+a+" "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping:"+a+" "+b);
		
	}
	
	public ConstructorOverLoading(char a, char b)
	{
		char c='C';
		System.out.println("Before swapping:"+a+" "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping:"+a+" "+b);
		
	}
	

	public static void main(String[] args) {
		
		ConstructorOverLoading c=new ConstructorOverLoading(12, 34);
		ConstructorOverLoading c1=new ConstructorOverLoading('A', 'B');
		
		

	}

}
