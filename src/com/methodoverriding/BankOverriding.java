package com.methodoverriding;
/*
 * A bank has a principal amount and a rate of interest which is 2%. A savings account has a rate of interest 3% while a current
 *  account has 5%. Write a method that displays the rate of interest based on whether the account is default/ savings/ current.
 */

class Bank {
    double principalAmount;

    public Bank(double principalAmount) 
    {
        this.principalAmount = principalAmount;
    }

    public void displayInterestRate() 
    {
    	 System.out.println("Principal Amount: "+principalAmount);
        System.out.println("Default Account: 2% Interest Rate");
    }
}


class SavingsAccount extends Bank 
{
    public SavingsAccount(double principalAmount) 
    {
        super(principalAmount);
    }

    @Override
    public void displayInterestRate() 
    {
    	System.out.println("Principal Amount: "+principalAmount);
        System.out.println("Savings Account: 3% Interest Rate");
    }
}


class CurrentAccount extends Bank 
{
    public CurrentAccount(double principalAmount)
    {
        super(principalAmount);
    }

    @Override
    public void displayInterestRate()
    {
    	System.out.println("Principal Amount: "+principalAmount);
        System.out.println("Current Account: 5% Interest Rate");
        
    }
}


public class BankOverriding
{

	public static void main(String[] args) 
	{
		
		 Bank defaultAccount = new Bank(100);
	        defaultAccount.displayInterestRate();

	        SavingsAccount savingsAccount = new SavingsAccount(200);
	        savingsAccount.displayInterestRate();

	        CurrentAccount currentAccount = new CurrentAccount(300);
	        currentAccount.displayInterestRate();
	}

}
