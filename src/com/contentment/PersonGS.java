package com.contentment;

class Address
{
	private int pincode;
	private String city;
	
	public void setPincode(int pincode)
	{
		this.pincode=pincode;
	}
	
	public void setCity(String city)
	{
		this.city=city;
	}
	
	public int getPincode()
	{
		return pincode;
	}
	
	public String getCity()
	{
		return city;
	}
	
}



public class PersonGS {
	
	private int pid;
	private String pname;
	Address adr;
	
	public void setPid(int pid)
	{
		this.pid=pid;
	}
	
	public void setPname(String pname)
	{
		this.pname=pname;
	}
	
	public void setAdr(Address adr)
	{
		this.adr=adr;
	}
	
	public int getPid()
	{
		return pid;
	}
	
	public String getPname()
	{
		return pname;
	}
	
	public Address getadr()
	{
		return  adr;
	}
	

	public static void main(String[] args) {
		
		PersonGS p=new PersonGS();
		p.setPid(01);
		p.setPname("karan");
		p.setAdr(new Address());
		p.getadr().setCity("Jalna");
		p.getadr().setPincode(431212);
		
		System.out.println("Person Id: "+p.getPid());
		System.out.println("Person Name: "+p.getPname());
		System.out.println("Person City: "+p.getadr().getCity());
		System.out.println("Person city pincode: "+p.getadr().getPincode());
		
	}

}
