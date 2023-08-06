package com.ifelsestatement;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		int fnum,snum,ans;
		char sign;  
		
		
		System.out.print("Please Enter your first digit: "); 
		fnum=sc.nextInt(); 
		
		System.out.print("Enter the second digit: ");
		snum=sc.nextInt();
		
		System.out.print("Enter the mathematical operator to be used: "); 
		sign=sc.next().charAt(0); 
		
		if (sign == '+' )
		{
			ans=fnum + snum;
			System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
		}
		else if(sign == '-')
		{
			ans=fnum-snum;
			System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
		}
		else if(sign == '/')
		{
				ans=fnum/snum;
				System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
	    }
		else if(sign == '*')
		{
					ans=fnum*snum;
					System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
		}
		else
		{
			System.out.println("Your Input is not correct.");
		}
		
		sc.close();

	}

}
