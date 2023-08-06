package lab_20_07_23.model.sub;

import lab_30_07_23.model.Person;

public class Employee extends Person {
	protected String designation;

	public Employee(int id, String name,String designation) {
		super(id, name);
		this.designation=designation;
	}
	
	public void setDesignation(String designation)
	{
		this.designation=designation;
	}
	
	public String getDesignation()
	{
		return designation;
	}
	
	public String toString(String designation)
	{
		return "desination";
	}
	
	

}
