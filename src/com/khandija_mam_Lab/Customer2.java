package com.khandija_mam_Lab;

public class Customer2 {

	public static void main(String[] args) {
		Customer1 c1=new Customer1();
//		c1.doPublic("sss");
//		//c1.doPrivate(1100);
//		c1.doProtected("ahssh@gmail.com");
//		c1.doDefault1("Pune");
		
		c1.cName="Karan";
		System.out.println("Customer Name: "+c1.cName);
		//c1.accBalance=12000;
		//System.out.println("Customer Balance: "+c1.accBalance);
		c1.cEmail="aaaa@gmail.com";
		System.out.println("Customer Email: "+c1.cEmail);
		c1.cAddress="pune";
		System.out.println("Custor address: "+c1.cAddress);

	}

}
