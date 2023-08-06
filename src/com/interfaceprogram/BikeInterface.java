package com.interfaceprogram;
/*
 *Create interfaces Bike and Scooty, both of which have two methods- offer() and details() (details() is default method). 
 * Create a new class BuySomething which implements both interfaces. To remove ambiguity, create a method details()
 *  in BuySomething class as well in which call the details() method of both interfaces. Call the methods of BuySomething 
 *  class in main method.
 */
interface Bike1
{
    void offer();
    default void details()
    {
        System.out.println("This is a bike.");
    }
}

// Interface Scooty
interface Scooty 
{
    void offer();
    default void details() 
    {
        System.out.println("This is a scooty.");
    }
}

// Class BuySomething implementing Bike and Scooty interfaces
class BuySomething implements Bike1, Scooty 
{
    @Override
    public void offer()
    {
        System.out.println("Offering something to buy.");
    }

    @Override
    public void details()
    {
        // Call details() method of both interfaces explicitly
        Bike1.super.details();
        Scooty.super.details();
    }
}


public class BikeInterface
{

	public static void main(String[] args)
	{
		BuySomething b = new BuySomething();
        b.offer();
        b.details();


	}

}
