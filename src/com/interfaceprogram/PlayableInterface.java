package com.interfaceprogram;
/*
 * Write a Java program to create an interface Playable with a method play() that takes no arguments and returns void.
 * Create three classes Football, Volleyball, and Basketball that implement the Playable interface and override the
 *  play() method to play the respective sports.
 */

interface Playable 
{
    void play();
}

// Football class
class Football implements Playable
{
    @Override
    public void play()
    {
        System.out.println("Playing Football");
    }
}

// Volleyball class
class Volleyball implements Playable
{
    @Override
    public void play() 
    {
        System.out.println("Playing Volleyball");
    }
}

// Basketball class
class Basketball implements Playable 
{
    @Override
    public void play()
    {
        System.out.println("Playing Basketball");
    }
}


public class PlayableInterface {

	public static void main(String[] args) {
		 Playable f = new Football();
	        Playable v = new Volleyball();
	        Playable b = new Basketball();

	        f.play();
	        v.play();
	        b.play();	
	}

}
