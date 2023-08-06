package com.whileloop;

import java.util.Scanner;

public class Chocolate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter chocolate number:");
		int num=sc.nextInt();
		int i=1;
		int nc=0;
		int count=0;
		while(i<=num)
		{
			if(i%3==0)
			{
				count++;
			
			}
			nc=num+count;
			i++;
		}
		
			System.out.print(nc);
			sc.close();
	}

}
