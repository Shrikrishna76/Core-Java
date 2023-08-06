package com.interfaceprogram;
/*
 * Write a Java program to create an interface Flyable with a method called fly_obj(). Create three classes Spacecraft, 
 * Airplane, and Helicopter that implement the Flyable interface. Implement the fly_obj() method for each of the three
 *  classes.
 */

interface Flyable 
{
    void fly_obj();
}


class Spacecraft implements Flyable 
{
    @Override
    public void fly_obj() 
    {
        System.out.println("Spacecraft is flying in space.");
    }
}


class Airplane implements Flyable 
{
    @Override
    public void fly_obj()
    {
        System.out.println("Airplane is flying in the sky.");
    }
}


class Helicopter implements Flyable 
{
    @Override
    public void fly_obj()
    {
        System.out.println("Helicopter is flying in the air.");
    }
}


public class FlayableInterface {

	public static void main(String[] args) {
		Flyable s = new Spacecraft();
        Flyable a = new Airplane();
        Flyable h = new Helicopter();

        
        s.fly_obj();
        a.fly_obj();
        h.fly_obj();

	}

}
