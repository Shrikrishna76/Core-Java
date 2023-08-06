package com.interfaceprogram;

import java.io.Serializable;

@FunctionalInterface
interface Washable
{
	void wash();//abstract method
	
	default void m1q()
	{
		
	}
}
@FunctionalInterface
interface A
{
	void m1();
}

class B implements Serializable
{
	
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
