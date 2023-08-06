package com.interfaceprogram;
/*
 * Create an interface Account having methods- deposit(), withdraw() and aboutBank() (abountBank() is a static method).
 * Create two classes Saving and Current which implement the Account interface. Call the methods of Saving and Current 
 * classes in main method.,create a new method in Account interface- takeLoan() (takeLoan() is a default method).
 * takeLoan() method would be implemented by Saving class only. Call the methods of Saving and Current classes in main
 * method.
*/

interface Account 
{
    void deposit(double amount);
    void withdraw(double amount);
    static void aboutBank()
    {}

    // Default method
    default void takeLoan()
    {
        System.out.println("Loans can only be taken from a Saving account.");
    }
}

class Saving implements Account
{
    @Override
    public void deposit(double amount) 
    {
        System.out.println("Deposit in Saving account: " + amount);
    }

    @Override
    public void withdraw(double amount) 
    {
        System.out.println("Withdraw from Saving account: " + amount);
    }

    public static void aboutBank()
    {
    	
        System.out.println("This is a Saving account in our bank.");
    }

    // Additional method specific to Saving account
    public void takeLoan(double loanAmount)
    {
        System.out.println("Loan taken from Saving account: " + loanAmount);
    }
}

class Current implements Account 
{
    @Override
    public void deposit(double amount) 
    {
        System.out.println("Deposit in Current account: " + amount);
    }

    @Override
    public void withdraw(double amount)
    {
        System.out.println("Withdraw from Current account: " + amount);
    }

    public static void aboutBank() 
    {
        System.out.println("This is a Current account in our bank.");
    }
}


public class BankInterface 
{

	public static void main(String[] args)
	{
		Saving s = new Saving();
        s.aboutBank();
        s.deposit(5000);
        s.withdraw(2000);
        s.takeLoan(1000);
        s.takeLoan();

        System.out.println();

        Current c = new Current();
        c.aboutBank();
        c.deposit(3000);
        c.withdraw(1000);
        

	}

}
