package com.khadija_mam_assignment;

import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Book Name:");
		String bookName=sc.next();
		System.out.print("Enter Book Price:");
		int bookPrice=sc.nextInt();
		System.out.print("Enter author Name:");
		String authorName=sc.next();
		
		Book b=new Book();
		b.setBookName(bookName);
		b.setBookPrice(bookPrice);
		b.setAuthorName(authorName);
		
		System.out.println("Book Name: "+b.getBookName());
		System.out.println("Book Price: "+b.getBookPrice());
		System.out.println("Book Author Name: "+b.getAuthorName());
		
	}

}
