package com.methodoverriding;
/*
 * WAP to create class company with method address. create class eBay which extends company implement address() differently in eBay 
 * class.Here the method address ()has been overridden in child class.
 */

class Company {
    public void address() {
        System.out.println("Company address: 123 Railway station Road, ,chhtrapati Sambhajinagar");
    }
}

class eBay extends Company {
    @Override
    public void address() 
    {
        System.out.println("eBay address: 456 Market Street, Law college, pune");
    }
}



public class MethodOverrideCompany {

	public static void main(String[] args) {
		eBay ebay = new eBay();
        ebay.address(); 
        
        Company c=new Company();
        c.address();
	}

}
