package com.contentment;

class Engine
{
	private String type;
	
	public void setType(String type)
	{
		this.type=type;
	}
	
	public String gettype()
	{
		return type;
	}
	
	
}

public class Car {
	
	private int m_no;
	private String name;
	private int price;
	Engine en;
	
	public void setM_no(int m_no)
	{
		this.m_no=m_no;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public void setEn(Engine en)
	{
		this.en=en;
	}
	
	public int getM_no()
	{
		return m_no;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public Engine getEn()
	{
		return en;
	}
	
	

	public static void main(String[] args) {
		
		Car c=new Car();
		c.setM_no(1);
		c.setName("Maroti suzuki");
		c.setPrice(100000);
		c.setEn(new Engine());
		c.getEn().setType("Petrol");
	
		System.out.println("Model No:"+c.getM_no());
		System.out.println("Car Name:"+c.getName());
		System.out.println("Car price:"+c.getPrice());
		System.out.println("Engine Type:"+c.getEn().gettype());
		
		

	}

}
