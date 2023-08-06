package com.nestedforloop;

public class Pattern7 {

	public static void main(String[] args) {
		for(int i=1; i<=3;i++)
		{
			for(int k=3;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++)
			{
				System.out.print(j);
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
		
			}
			
			System.out.println();
		}
	}

}
