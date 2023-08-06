package com.methodoverriding;
/*
 * WAP to create class Programmer with Method workingHours().create class Employee which extends Programmer implement 
 * workingHours()differently in child.
 */

class Programmer 
{
    public void workingHours() 
    {
        System.out.println("Programmer: 8 hours per day");
    }
}


class Employee extends Programmer 
{
    @Override
    public void workingHours() 
    {
        System.out.println("Employee: 9 hours per day");
    }
}


public class MethodOverridingProgrammers {

	public static void main(String[] args) 
	{
		 Programmer programmer = new Programmer();
	        programmer.workingHours();

	        Employee employee = new Employee();
	        employee.workingHours();

	}

}
