package com.khadija_mam_assignment;

public class Book {
	
	private String bookName;
	private int bookPrice;
	private String authorName;
	
	public void setBookName(String bname)
	{
		bookName=bname;
		//this.bookName=bookName;
	}
	
	public void setBookPrice(int bookPrice)
	{
		this.bookPrice=bookPrice;
	}
	
	public void setAuthorName(String authorName)
	{
		this.authorName=authorName;
	}
	
	public String getBookName()
	{
		return bookName;
	}
	
	public int getBookPrice()
	{
		return bookPrice;
	}
	
	public String getAuthorName()
	{
		return authorName;
	}

}
