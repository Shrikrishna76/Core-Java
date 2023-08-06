package com.forloop;

import java.util.Scanner;

public class UptoPrime {

	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Startig number:");
			int fn=sc.nextInt();
			System.out.print("Enter End number:");
			int sn=sc.nextInt();
			System.out.print("Enter how many number you want:" );
			int n=sc.nextInt();
			int count=1;
			for(int i=fn;i<=sn;i++)
			{
				boolean isprime=true;
				for(int j=2;j<fn;j++)
				{
					if(i%j==0)
					{
						isprime=false;
						break;
					}
				}
				if(isprime==true && count<=n)
				{
					System.out.println(i);
					count++;
				}
			}
			sc.close();
		}

	}


