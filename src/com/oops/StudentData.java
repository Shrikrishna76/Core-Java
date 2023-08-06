package com.oops;

public class StudentData {
	
	private int id=1;
	private String name="karan";
	private double per=75.00;
	private boolean placed=true;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setPer(double per)
	{
		this.per=per;
	}
	
	public void setPlaced(boolean placed)
	{
		this.placed=placed;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPer()
	{
		return per;
	}
	
	public boolean getPlaced()
	{
		return placed;
	}


}
