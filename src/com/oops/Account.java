package com.oops;

import java.util.Scanner;

public class Account {
	
	int aId;
	String aName;
	double abalance;
	double cb;
	double withdraw;
	double deposite;
	
	public void accept(int id, String name, double balance, double wd, double dp )
	{
		aId=id;
		aName=name;
		abalance=balance;
		withdraw=wd;
		deposite=dp;
	}
	
	public void display()
	{
		System.out.println("Account Id:"+aId);
		System.out.println("Account Name:"+aName);
		System.out.println("Account balance:"+abalance);
		System.out.println("Account balance withdraw:"+withdraw);
		System.out.println("Account current balance:"+cb);
		
	}
	
	public void withdrawal()
	{
		if(abalance>0)
		{
			
			
			 cb=abalance-withdraw;
			
		}
		
	}
	
	public void deposite()
	{
		
		cb=cb+deposite;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Account Id:");
		int aId=sc.nextInt();
		System.out.print("Enter Name:");
		String aName=sc.next();
		System.out.print("Enter Account balance:");
		double abalance =sc.nextDouble();
		
		System.out.print("Enter ammount to withdrawal:");
		double withdraw=sc.nextDouble();
		System.out.print("Enter ammount to deposite:");
		double deposite=sc.nextDouble();
		
		Account a=new Account();
		a.accept(aId, aName,abalance,withdraw,deposite);
		
		a.withdrawal();
		a.deposite();
		a.display();
		
		sc.close();
	}

}
