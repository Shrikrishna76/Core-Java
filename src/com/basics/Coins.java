package com.basics;
/*Each birthday, Meenu’s parents gift her gold coins. On her 1st birthday she got one coin from them, 2nd birthday 8 coins, */
import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Age:");
		int age=sc.nextInt();
		int coins=age*age*age;
		
		System.out.print("on "+age+" birthday get coins:"+coins);
		sc.close();
	}

}
