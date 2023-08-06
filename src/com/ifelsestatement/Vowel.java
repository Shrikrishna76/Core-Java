package com.ifelsestatement;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Alphabet:");
		char alph=sc.next().charAt(0);
		
		if(alph=='a' || alph=='e' || alph=='o' ||alph=='i' ||alph=='u')
		{
			System.out.println("It is a vowel");
		}
		else
		{
			System.out.println("It is a consonant");
		}
		sc.close();
	}

}
