package com.ifelsestatement;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Basic Salary:");
		int b_salary=sc.nextInt();
		float hra, da;
		if(b_salary<=10000)
		{
			
			hra=b_salary*0.20f;
			da=b_salary*0.80f;
		}
		else if(b_salary<20000)
		{
			hra=b_salary*0.25f;
			da=b_salary*0.90f;
		}
		else
		{
			hra=b_salary*0.30f;
			da=b_salary*0.95f;
		}
		System.out.println("Gross salary:"+(b_salary+hra+da));
		sc.close();
	}

}
