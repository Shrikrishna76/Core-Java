package com.abstraction;

/*
 * You have to build a phone book. The phone book has the name and contact of a person. This is an openly accessible 
 * book so it should be designed accordingly.
 */

abstract class Contact 
{
    public String name;

    public Contact(String name) 
    {
        this.name = name;
    }

    public abstract String getContactInfo();
}


class PhoneContact extends Contact 
{
    public String phoneNumber;

    public PhoneContact(String name, String phoneNumber)
    {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getContactInfo() 
    {
        return "Name: " + super.name + ", Phone Number: " + phoneNumber;
    }
}


public class PhoneBook {

	public static void main(String[] args) {
		 Contact c1 = new PhoneContact("karan", "1234567890");
	        Contact c2 = new PhoneContact("Amol", "9876543210");

	        // Display contact information
	        System.out.println(c1.getContactInfo());
	        System.out.println(c2.getContactInfo());

	}

}
