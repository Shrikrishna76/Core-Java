package com.forloop;
/*	Write the program in Java to display the first ten terms of the following series:
1, 2, 4, 7, 11,*/

public class Series3 {

	public static void main(String[] args) {
		int i,s;
		for( i=0; i<10; i++)
		{
			 s=1+((i*(i+1))/2);
			System.out.print(s+" ");
		}
	}

}
