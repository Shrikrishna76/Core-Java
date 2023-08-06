package com.oops;
/*
 * 1. WAJP2 create a class Kid with method readBook() and another method 
readBook () with 2 parameters. The method readBook here is over-loaded (same 
method name but different parameters)
 */

public class Kid {
	
	public void readBook()
	{
		System.out.println("Without Parameter method");
	}
	
	public void readBook(int bid, String name)
	{
		
		System.out.println("Book Id : "+bid+"  Book Name: "+name);
	}

	public static void main(String[] args) {
		Kid k=new Kid();
		k.readBook();
		k.readBook(12, "java");
		

	}

}
