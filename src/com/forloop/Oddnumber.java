package com.forloop;
//write a code to find out the odd number sum between 1 to 20.
public class Oddnumber {

	public static void main(String[] args) {
		int i;
		int sum=0;
		for( i=1; i<=20;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("Total sum:"+sum);
	}

}
