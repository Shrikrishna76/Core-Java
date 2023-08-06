package com.khandija_mam_Lab;

import java.util.Scanner;

public class Paytm {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Customer c=new Customer();
		c.setId(1);
		c.setName("Karan");
		System.out.print("Enter the balance:");
		int balance=sc.nextInt();
		System.out.print("Enetr the amount to withdraw:");
		int a_withdraw=sc.nextInt();
		if(a_withdraw<=balance)
		{
			balance=balance-a_withdraw;
			c.setBalance(balance);
		}
		
		
		System.out.println("Customer Id:"+c.getId());
		System.out.println("Customer Name:"+c.getName());
		System.out.println("Customer Id:"+c.getBalance());
		sc.close();
	}

}
