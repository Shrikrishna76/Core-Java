package com.abstraction;
/*
 * A company has employees and wants to keep a track of their names, id and hours of work. 
 * The employees are specifically categorised into part-time and full-time. Salary needs to be calculated 
 * for both however, where part-time employees get 200 rs. Per hour and Full-time employees get 500 rs. per hour. 
 * Write a program which does the same.
 */
abstract class Employee {
    private String name;
    private int id;
    private int hoursWorked;

    public Employee(String name, int id, int hoursWorked) 
    {
        this.name = name;
        this.id = id;
        this.hoursWorked = hoursWorked;
    }

    public String getName()
    {
        return name;
    }

    public int getId() 
    {
        return id;
    }

    public int getHoursWorked()
    {
        return hoursWorked;
    }

    // Abstract method to calculate the salary
    public abstract int calculateSalary();
}

class PartTimeEmployee extends Employee
{
    private  int part_time_rate = 200;

    public PartTimeEmployee(String name, int id, int hoursWorked)
    {
        super(name, id, hoursWorked);
    }

    @Override
    public int calculateSalary()
    {
        return getHoursWorked() * part_time_rate;
    }
}

class FullTimeEmployee extends Employee 
{
    private  int full_time_rate = 500;

    public FullTimeEmployee(String name, int id, int hoursWorked)
    {
        super(name, id, hoursWorked);
    }

    @Override
    public int calculateSalary()
    {
        return getHoursWorked() * full_time_rate;
    }
}



public class Company {

	public static void main(String[] args) {
		Employee emp1 = new PartTimeEmployee("karan", 101, 20);
        Employee emp2 = new FullTimeEmployee("Amol", 102, 40);

        // Calculate salaries
        int salary1 = emp1.calculateSalary();
        int salary2 = emp2.calculateSalary();

        // Display the results
        System.out.println("Employee: " + emp1.getName() + ", ID: " + emp1.getId() + ", Salary: Rs. " + salary1);
        System.out.println("Employee: " + emp2.getName() + ", ID: " + emp2.getId() + ", Salary: Rs. " + salary2);
 


	}

}
