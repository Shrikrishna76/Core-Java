package com.ifelsestatement;

import java.util.Scanner;

public class CharacterCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter character:");
		char ch=sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z')
		{
			System.out.println("Character is upper case");
		}
		else
		{
			System.out.println("Character is lower case");
		}
		sc.close();
	}

}
