package com.khandija_mam_Lab;


public class Customer1 {
	
	public String cName;
	private int accBalance;
	protected String cEmail;
	 String cAddress;
	
//	
//	 public void doPublic(String cName)
//	{
//		System.out.println("Customer Name: "+cName);
//	}
//	
//	private void doPrivate(int accBalance)
//	{
//		System.out.println("Customer Balance: "+accBalance);
//	}
//	
//	protected void doProtected(String cEmail)
//	{
//		System.out.println("Customer Email: "+cEmail);
//	}
//	void doDefault1(String cAddress)
//	{
//		System.out.println("Custor address: "+cAddress);
//	}
	
	public static void main(String args[])
	{
		Customer1 c1=new Customer1();
//		c1.doPublic("sss");
//		c1.doPrivate(1100);
//		c1.doProtected("ahssh@gmail.com");
//		c1.doDefault1("Pune");
		
		c1.cName="Karan";
		System.out.println("Customer Name: "+c1.cName);
		c1.accBalance=12000;
		System.out.println("Customer Balance: "+c1.accBalance);
		c1.cEmail="aaaa@gmail.com";
		System.out.println("Customer Email: "+c1.cEmail);
		c1.cAddress="pune";
		System.out.println("Custor address: "+c1.cAddress);

		
				
	}

	
		
		

	

}
