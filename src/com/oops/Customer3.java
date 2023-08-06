package com.oops;

import com.khandija_mam_Lab.Customer1;

public class Customer3 extends Customer1 {

	public static void main(String[] args) {
		Customer3 c3=new Customer3();
//		//c3.doDefault("sss");
//		//c3.doPrivate(1100);
//		c3.doProtected("ahssh@gmail.com");
//		//c3.doDefault1("Pune");
		
		c3.cName="Karan";
		System.out.println("Customer Name: "+c3.cName);
//		c3.accBalance=12000;
//		System.out.println("Customer Balance: "+c3.accBalance);
		c3.cEmail="aaaa@gmail.com";
		System.out.println("Customer Email: "+c3.cEmail);
//		c3.cAddress="pune";
//		System.out.println("Custor address: "+c3.cAddress);

	}

}
