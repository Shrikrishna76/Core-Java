package com.inheritance;

class Bank
{
	public double getInterest()
	{
		return 0.0;
	}
}

class SBI extends Bank
{
	public double getInterest()
	{
		return 6.0;
	}
}

class ICICI extends Bank
{
	public double getInterest()
	{
		return 6.2;
	}
}

class Axis extends Bank
{
	public double getInterest()
	{
		return 7.8;
	}
}

public class BankInheritance {

	public static void main(String[] args) {
		
		Bank sbi=new SBI();
		Bank icici=new ICICI();
		Bank axis=new Axis();
		
		System.out.println("Interest of SBI : "+sbi.getInterest());
		System.out.println("Interest of ICICI : "+icici.getInterest());
		System.out.println("Interest of Axis : "+axis.getInterest());
		

	}

}
