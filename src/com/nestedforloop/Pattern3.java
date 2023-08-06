package com.nestedforloop;

public class Pattern3 {
	public static void main(String[] args) {
		for(int i=0;i<=6;i++)
		{
			for(int j=0;j<=6;j++)
			{
				if(i==3)
			
				{
					System.out.print("*");
				}
				else if(j==3)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("########################################################################################");
		
		for(int j=1;j<=5;j++)
		{
			for(int i=1;i<=j;i++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

		
		System.out.println("########################################################################################");
		
		
		for(int i=1;i<=5;i++)
			{
			for(int j=1;j<=i;j++)
				{
					System.out.print(i);
				}
				System.out.println();
	}
		
		System.out.println("########################################################################################");
		
		
		for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=5-i;j++)
			{				
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		System.out.println("########################################################################################");
		
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=i;j++)
			{				
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		System.out.println("########################################################################################");
		
		
		for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
				System.out.print("0");	
				}
				else
				{
					System.out.print("1");
				}
				
				
			}
			System.out.println();
		}

	}
}
