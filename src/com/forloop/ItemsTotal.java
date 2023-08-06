package com.forloop;
/*You have 100 items (1,2,3,4....100) the price of each item is the same as its number . i.e items 1 is
 * of 1 rs. item 2 is of rs. And so on.
 * Calculate the total of the items.
 */
public class ItemsTotal {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		for(i=1; i<=100; i++)
		{
			sum=sum+i;
		}
		System.out.print("Sum is:"+sum);

	}

}
