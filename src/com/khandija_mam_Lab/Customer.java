package com.khandija_mam_Lab;

public class Customer {

	private int id;
	private String name;
	private int balance;
	
	public void setId(int Id)
	{
			id=Id;
	}
	
	public void setName(String Name)
	{
		name=Name;
	}
	
	public void setBalance(int n)
	{
		balance=n;
	}
	
	
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getBalance()
	{
		return balance;
	}
}
