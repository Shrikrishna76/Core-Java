package com.oops;


public class ItemsDetails {
	int iId;
	String Iname;
	float Iprice;
	
	void accept(int id, String name, float price)
	{
		iId=id;
		Iname=name;
		Iprice=price;
	}
	
	void display()
	{
		System.out.print("Item Id is: "+iId+"\nItem Name: "+Iname+"\nItem Price: "+Iprice+" Rs");
	}
	
	public static void main(String[] args) {
		ItemsDetails id= new ItemsDetails() ;
		id.accept(01,"laptop",45000.0f);
		
		id.display();
		
	}
}
