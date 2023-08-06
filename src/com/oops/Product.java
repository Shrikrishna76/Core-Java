package com.oops;

import java.util.Scanner;


public class Product {


	int pId;
	String pName;
	int pprice;
	int pq;
	int bill;
	
	public void accept(int id, String pn, int price, int pqn )
	{
		pId=id;
		pName=pn;
		pprice=price;
		pq=pqn;
	}
	
	
	
	public void display()
	{
		
		System.out.println("Product Id:"+pId+"  Product name:"+pName+"  Product Price:"+pprice+"  Product quntity:"+pq);
		if(pq>0)
		{
			System.out.print("Total bill:"+pprice*pq);
		}
		else
		{
			System.out.print("Error");
		}
		}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Product Id:");
		int id=sc.nextInt();
		
		System.out.print("Enter Product name:");
		String pn=sc.next();

		
		System.out.print("Enter Product price:");
		int price=sc.nextInt();

		
		System.out.print("Enter Product quntity:");
		int pq=sc.nextInt();
		
		Product p=new Product();
		p.accept(id, pn, price, pq);
		p.display();
		
		sc.close();
		


	}


}
