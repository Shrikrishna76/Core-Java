package com.switchcase;

import java.util.Scanner;

public class BankOeration {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your choice:");
		System.out.println("1.Deposit \n 2.Withdraw \n 3.Check Balance \n 4.Exit");
		int choice=sc.nextInt();
		int balance=10000;
		switch(choice)
		{
		case 1:
			System.out.print("Enter Deposit Balance:");
			int dep=sc.nextInt();
			balance=balance+dep;
			System.out.println("Your balance:"+balance);
			break;
		
		case 2:
			System.out.print("Enter amount to withdraw:");
			int with=sc.nextInt();
			balance=balance-with;
			break;
			
		case 3:
			System.out.print(balance);
			break;
		
		case 4:
			System.exit(0);
		}
		sc.close();
	}

}
