package com.forloop;
/*you have 20 barrels of fuel. The price per barrel is 89rs. for the first 10 barrels. If someone wants more than 10 barrels, the price 
 * reduces by the number of barrels bought. 
 * for eg. the price of 6 barrels is 68*89 but price of 12 barrels is 12*(89-12)
 * or price of 18 barrels is 18*(89-18) so on .
 * Display all the prices from 1 to 20 barrels.
 * */
public class Barrel {

	public static void main(String[] args) {
		int i;
		int price=89;
		int total=0;
		for(i=1; i<=20;i++)
		{
			if(i<=10)
			{
				total=total+price;
			}
			else {
			total=total+(price-(i-10));
		}
		System.out.println("Price of "+i+" barrel = "+total);
	}

	}

}
