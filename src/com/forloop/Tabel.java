package com.forloop;
//create tabel
import java.util.Scanner;

public class Tabel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int t=sc.nextInt();
		int s;
		for(int i=1; i<=10;i++) 
		{
			s=t*i;
			
			System.out.println(s);
			
		}
		sc.close();
	}

}
