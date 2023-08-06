package com.exams;
/*
 * Write a program to define a class Employee to accept emp_id, emp _name, basic_salary 
from the user and display the gross_salary.
 */

import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private double basicSalary;
    
    
    public Employee(int empId, String empName, double basicSalary)
    {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
       
    }

    
    public double calculateGrossSalary()
    {
        double allowances = 0.2 * basicSalary;
        double deductions = 0.2 * basicSalary;

       
        return basicSalary + allowances - deductions;
    }

    
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}



public class Grosssalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = sc.next();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();
        
       

        Employee emp = new Employee(empId, empName, basicSalary);
        emp.displayEmployeeDetails();
        emp.calculateGrossSalary();

        sc.close();

	}

}
