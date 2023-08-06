package com.forloop;
/*write code to print number between 1 to 20 if number is divisible by 3 then print onex , if number is divisible by 5 then
 * print tel, if number is divisible by 3 & 5 then print onextel*/

public class OneXTel {

	public static void main(String[] args) {
		int i;
		for( i=1; i<=20;i++)
		{
			
			if(i%3==0 && i%5==0) 
			{
			System.out.println("OnexTel");
			continue;
			}
			else if(i%3==0) 
			{
				System.out.println("onex");
				continue;
			}
			else if(i%5==0 ) 
			{
				System.out.println("Tel");
				continue;
			}
			System.out.println(i);
			
		}
	}

}
