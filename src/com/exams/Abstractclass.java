 package com.exams;
/*
 *Create an abstract class Accounts with the following details: Data Members: (a) Balance (b) 
accountNumber (c) accountHoldersName (d) address Methods: (a) withdrawl()- abstract (b) 
deposit()- abstract (c) display() to show the balance of the account number Create a subclass 
of this class SavingsAccount and add the following details:
 */

abstract class Accounts {
    protected double balance;
    protected int accountNumber;
    protected String accountHoldersName;
    protected String address;

    // Constructor
    public Accounts(double balance, int accountNumber, String accountHoldersName, String address)
    {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
    }

    // Abstract methods
    public abstract void withdrawal(double amount);
    public abstract void deposit(double amount);

    // Method to display the balance of the account
    public void display()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder's Name: " + accountHoldersName);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
        System.out.println("-------------------------------------------");
    }
}

// Subclass SavingsAccount
class SavingsAccount extends Accounts {
    // Constructor for the SavingsAccount class
    public SavingsAccount(double balance, int accountNumber, String accountHoldersName, String address)
    {
        super(balance, accountNumber, accountHoldersName, address);
    }

    // Implementing abstract methods
    @Override
    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } 
        else 
        {
            System.out.println("Withdrawal failed. Insufficient balance.");
        }
    }

    @Override
    public void deposit(double amount)
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        }
        else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }
}


public class Abstractclass
{

	public static void main(String[] args) 
	{
		 SavingsAccount sa = new SavingsAccount(1000, 12345, "karan", "123 Main Street");

	        // Testing deposit and withdrawal methods
	        sa.display();
	        sa.deposit(500);
	        sa.withdrawal(200);
	        sa.display();

	}

}
