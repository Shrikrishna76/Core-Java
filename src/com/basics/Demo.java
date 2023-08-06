package com.basics;

public class Demo {

	public static void main(String[] args) {
		int a=2;
		int b=2;
		int x= a++ + ++b;
		System.out.println(x+""+a+""+b);
		
		int y= ++b - --a;
		System.out.println(y+""+a+""+b);
		
		int z=++a - --b -a;
		System.out.println(z+""+a+""+b);
		
		int p= a-- -b-- -b;
		System.out.println(p+""+a+""+b);
		
		int q=--a - ++b + a++;
		System.out.println(q+""+a+""+b);
		
		int r= ++a - b++ + b;
		System.out.println(r+""+a+""+b);
		

	}

}
