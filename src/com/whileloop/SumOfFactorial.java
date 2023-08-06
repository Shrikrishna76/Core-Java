package com.whileloop;
//write code to find the sum of 1!+2!+3!+4!+5!
public class SumOfFactorial {

	public static void main(String[] args) {
		int i=1;
		int fact=1;
		int sum=0;
		while(i<=5)
		{
			fact=fact*i;
			System.out.println(fact); 
			sum=sum+fact;
			i++;
			
		}
		
		 
		 System.out.print("Sum of factorial:"+sum);
	}

}
