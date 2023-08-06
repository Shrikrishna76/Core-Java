package com.contentment;

class MenuItems
{
	private int  miid;
	private String miname;
	private int miprice;
	
	public MenuItems(int miid, String miname, int miprice)
	{
		this.miid=miid;
		this.miname=miname;
		this.miprice=miprice;
	}
	
	public String toString()
	{
		return " Menu items id: "+miid+" Menu items name: "+" menu price: "+miprice;
	}
}
class Menu
{
	private int mid;
	private String mname;
	private MenuItems mi;
	
	public Menu(int mid, String name, MenuItems mi)
	{
		this.mid=mid;
		this.mname=mname;
		this.mi=mi;
	}
	
	public String toString()
	{
		return " Menu id: "+mi+" menu name: "+mname+" menu Items: "+mi;
	}
}
public class Hotel {
	
	private int hid;
	private String hname;
	private Menu m;
	
	public Hotel(int  hid, String hname, Menu m)
	{
		this.hid=hid;
		this.hname=hname;
		this.m=m;
	}
	
	public String toString()
	{
		return " Hotel id: "+hid+" Hotel Name: "+hname+" Menu: "+m;
	}
	

	public static void main(String[] args) {
		
		Hotel h=new Hotel(01,"Shivneri",(new Menu(02,"Maharastrian",(new MenuItems(03,"paneer",240)))));
		System.out.print(h);
		

	}

}
