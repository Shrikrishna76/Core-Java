package com.ifelsestatement;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter percentage:");
		int per=sc.nextInt();
		char Grade = 0;
		
		if(per>=80)
			Grade='A';
		  else if(per>=60)
			      Grade='B';
		      else if(per>=50)
		            	Grade='c';
		           else if(per>=45)
			              Grade='D';
		              else if(per>=25)
			                Grade='E';
		                 else if(per>=0)
		                    	Grade='f';
		
		     System.out.println("Your grade is : "+Grade);
		     sc.close();
	}

}
