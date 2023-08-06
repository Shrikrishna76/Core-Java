package com.switchcase;
//Write a program to print remark according to the grade obtained using switch statement

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" A \n B \n C \n D");
		System.out.println("Enter Grade:");

		char g = sc.next().charAt(0);
		System.out.println("Grade : " + g);
		char grade = Character.toUpperCase(g);
		switch (grade) {
		case 'A':
			System.out.print("very good");
			break;

		case 'B':
			System.out.print(" good");
			break;

		case 'C':
			System.out.print(" Bad");
			break;

		case 'D':
			System.out.print("very Bad");
			break;

		}
		sc.close();

	}

}
