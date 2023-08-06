package com.whileloop;
//write a code to find out the average of digit from the number.
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		int sum=0;
		int digit;
		int count=0;
		int avg=0;
		while(num>0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
			count++;
		}
		System.out.println("sum:"+sum);
		avg=sum/count;
		
		System.out.println("Average:"+avg);
		sc.close();
	}
	

}
