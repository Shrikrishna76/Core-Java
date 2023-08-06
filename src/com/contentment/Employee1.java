package com.contentment;

 class Department1
{
	private int did;
	private String dname;
	
	public Department1(int did, String dname)
	{
		this.did=did;
		this.dname=dname;
	}
	
	public String toString()
	{
		return "Department Id: "+did+" Department Nmae: "+dname;
	}
}

public class Employee1 {
	
	private int eid;
	private String ename;
	private Department1 dept;
	
	public  Employee1(int eid, String ename, Department1 dept)
	{
		this.eid=eid;
		this.ename=ename;
		this.dept=dept;
	}
	
	public String toString()
	{
		return "Employee Id: "+eid+" Emoloyee Name: "+ename+" Department: "+dept;
	}

	public static void main(String[] args) {
		
		
		Department1 d=new Department1(01,"HR");	
		
		Employee1 e=new Employee1(01, "Karan",d);
		
		System.out.println(e);

	}

}
