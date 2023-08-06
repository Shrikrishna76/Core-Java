package com.inheritance;

class Contact 
{
    private String contactPerson;
    private String mobile;
    private String email;

    public Contact(String contactPerson, String mobile, String email)
    {
        this.contactPerson = contactPerson;
        this.mobile = mobile;
        this.email = email;
    }

    public void setName(String contactPerson) 
    {
        this.contactPerson = contactPerson;
    }
    
    public void setEmail(String mobile) 
    {
        this.mobile=mobile;
    }
    
    public void setPhoneNumber(String email)
    {
        this.email=email;
    }
    
    public String getContactPerson() 
    {
        return contactPerson;
    }
    
    public String getMobile()
    {
        return mobile;
    }

    public String getemail()
    {
        return email;
    }

     public void printContact()
     {
    	
        System.out.println("Contact Person: " + contactPerson);
        System.out.println("Mobile: " + mobile);
        System.out.println("Email: " + email);
        
    }
}

class CompanyContact extends Contact 
{
    private String companyName;
    private String website;
    private String department;
    private String city;
    private String country;
    private String address;
    private int pin;

    public CompanyContact(String companyName, String website, String department, String city, String country, String address,int pin,String contactPerson, String mobile, String email) 
    {
        super( contactPerson, mobile,  email);
        this.companyName = companyName;
        this.website=website;
        this.department=department;
        this.city=city;
        this.country=country;
        this.address = address;
        this.pin=pin;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }
    
    public void setWebsite(String Website)
    {
        this.website = website;
    }
    
    public void setDepartment(String department)
    {
		this.department = department;
	}

    public void setCity(String city) 
    {
		this.city = city;
	}

    public void setCountry(String country)
    {
		this.country = country;
	}
    
    public void setAddress(String address)
    {
    	this.address=address;
    }
    
    public void setPin(int pin)
    {
		this.pin = pin;
	}
    
    public String getCompanyName() 
    {
        return companyName;
    }
    public String getWebsite()
    {
		return website;
	}
    
     public String getDepartment()
     {
		return department;
	}

	public String getCity() 
	{
		return city;
	}

	public String getCountry()
	{
		return country;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public int getPin()
	{
		return pin;
	}


    @Override
    public void printContact()
    {
        super.printContact();
        System.out.println("Company Name: " + companyName);
        System.out.println("Website:"+website);
        System.out.println("Department:"+department);
        System.out.println("City:"+city);
        System.out.println("Country:"+country);
        System.out.println("Address:"+address);
        System.out.println("Pin:"+pin);
        
    }
}

class EmployeeContact extends Contact
{
    private String city;
    private String country;
    private int pin;
    private String designation;
    private String dateOfBirth;

    public EmployeeContact(String city, String country,int pin, String designation, String dateOfBirth,String contactPerson, String mobile, String email)

    {
        super(contactPerson, mobile,  email);
        this.city=city;
        this.country=country;
        this.pin=pin;
        this.designation=designation;
        this.dateOfBirth=dateOfBirth;
    }

    public void setCity(String city) 
    {
		this.city = city;
	}

    public void setCountry(String country)
    {
		this.country = country;
	}

    public void setPin(int pin) 
    {
		this.pin = pin;
	}

	public void setDesignation(String designation)
	{
		this.designation = designation;
	}

	public void setDateOfBirth(String dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
	
	
	public String getCity()
	{
			return city;
	}
	 
	public String getCountry()
	{
			return country;
	}
	 
	public int getPin() 
	{
			return pin;
	}

	public String getDesignation() 
	{
		return designation;
	}

	public String getDateOfBirth()
	{
		return dateOfBirth;
	}

	@Override
    public void printContact() {
        super.printContact();
       System.out.println("City:"+city);
       System.out.println("Country:"+country);
       System.out.println("Pin:"+pin);
       System.out.println("Designation:"+designation);
       System.out.println("Date Of Birth:"+dateOfBirth);
    }
}


public class CompanyInheritance {

	public static void main(String[] args) 
	{
		  CompanyContact cc = new CompanyContact("Deogiri","www.deogiri.com", "Computer Science", "Chhatrapati Sambhajinagar", "India", "Railway station road", 431212, "ganesh", "1234567890", "ganesg@gmail.com");

	        
	        EmployeeContact ec = new EmployeeContact("Jalna", "India", 431212, "Coordinator", "05/05/1995", "ganesh", "1234567890", "ganesh@gmail.com");

	        
	        System.out.println("Company Contact:");
	        cc.printContact();

	        System.out.println("\nEmployee Contact:");
	        ec.printContact();
		
	}

}
