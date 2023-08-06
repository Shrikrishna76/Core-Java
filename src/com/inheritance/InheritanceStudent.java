package com.inheritance;

class Studentdata
{
	protected String name;
	protected int rollno;
	
	
}

class Record extends Studentdata
{
	
	protected String address;
	public void display(String name,int rollno, String address)
	{
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollno);
		System.out.println("Address:"+address);
	}
}

public class InheritanceStudent {

	public static void main(String[] args) {
		Record r=new Record();
		r.display("karan", 12, "Jalna");
		

	}

}
