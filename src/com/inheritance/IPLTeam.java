package com.inheritance;
/*
 * Create class IPLTeam with method play. Create child classes of IPLTeam 
called as CSK, RCB. In main, call play from child class object
 */

class CSK
{
	public void play2()
	{
	System.out.println("This is CSK");
	}
}

class RCB extends CSK
{
	public void play1()
	{
	System.out.println("This is RCB");
	}
}

public class IPLTeam extends RCB {
	public void play3()
	{
		System.out.println("This is IPL Team");
	}
	
	public static void main(String[] args) {
		IPLTeam i=new IPLTeam();
		i.play3();
		i.play1();
		i.play2();
		
		
	}

}
