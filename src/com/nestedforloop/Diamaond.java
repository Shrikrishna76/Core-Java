package com.nestedforloop;

public class Diamaond {

	public static void main(String[] args) {
		for(int i=1; i<=5;i++)
		{
			for(int k=i; k<=5;k++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=5; i++)
		{
			int s=1;

			for(int j=i;j<=5;j++)
			{
				
				while(s<=j)
				{
					System.out.print(" ");
					s++;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
