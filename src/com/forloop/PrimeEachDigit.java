package com.forloop;

import java.util.Scanner;

public class PrimeEachDigit {
	int fn;
	int ln;
	static int count=1;
	
	
	PrimeEachDigit(int fn, int ln)
	{
		this.fn=fn;
		this.ln=ln;
		
		
	}
	
	public void prime()
	{
		for(int i=fn;i<=ln;i++)
		{
			int temp=i;
			boolean isprime=true;
			while(temp>0)
			{
			int rem=i%10;
			
				for(int j=2;j<rem;j++)
				{
					
					if(rem%j==0)
					{
						isprime=false;
						break;
					}
				}
				temp=temp/10;
				
			}
			if(isprime==true && count<=ln)
			{
				System.out.println(i);
				count++;
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Startig number:");
		int fn=sc.nextInt();
		System.out.print("Enter End number:");
		int ln=sc.nextInt();
		
		PrimeEachDigit pd=new PrimeEachDigit(fn,ln);
		pd.prime();
		sc.close();
		

	}

}
