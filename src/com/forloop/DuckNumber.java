package com.forloop;

import java.util.Scanner;

class Check
{
	int num;
	int rem;
	int count=0;
	
	public Check(int num)
	{
		this.num=num;
		
	}
	public void show()
	{
		while(num>0)
		{
			
			int rem=num%10;
			if(rem==0)
			{
				count++;
			}
			num=num/10;
		}
		
		if(count==1)
		{
			System.out.println("Duck");
		}
		
		else
		{
			System.out.println("Not Duck");
		}
	
	}
}

public class DuckNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		
		Check c=new Check(num);
		c.show();
		
		
		

	}

}
