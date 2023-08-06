package com.abstraction;
/*
 * You need to create a locker with contents like money, jewellery and pin_code. The contents of the locker
 *  must not be accessible to anybody outside.
 */

abstract class Locker1
{
    private double money;
    private String jewellery;
    private int pinCode;

    // Constructor to initialize the locker's contents
    public Locker1(double money, String jewellery, int pinCode)
    {
        this.money = money;
        this.jewellery = jewellery;
        this.pinCode = pinCode;
    }

    // Method to display the contents of the locker (abstract method)
    public abstract void displayContents();

    
    protected double getMoney() 
    {
        return money;
    }

    protected String getJewellery() 
    {
        return jewellery;
    }

    protected int getPinCode()
    {
        return pinCode;
    }
}

// Subclass representing a specific type of locker (e.g., BankLocker)
class BankLocker extends Locker1
{
    private String bankName;

    public BankLocker(double money, String jewellery, int pinCode, String bankName)
    {
        super(money, jewellery, pinCode);
        this.bankName = bankName;
    }

    // Method to display the contents of the BankLocker
    @Override
    public void displayContents()
    {
        System.out.println("Bank Locker Contents:");
        System.out.println("Money: " + getMoney());
        System.out.println("Jewellery: " + getJewellery());
        System.out.println("Bank Name: " + bankName);
    }
}



public class Locker {

	public static void main(String[] args) {
		 BankLocker bl = new BankLocker(1000.0, "Diamond necklace", 1234, "HDFC");
		 bl.displayContents();

	}

}
