package com.forloop;
//write a code to display number from 1 to 20 if the number is divisible by 3 & 9 then stop the loop

public class Divisible {

	public static void main(String[] args) {
		int i;
		for( i=1; i<=20; i++)
		{
			if(i%3==0 && i%9==0)
			{
				
				break;
			}
			System.out.println(i);
			
			
			
		}
	}

}
