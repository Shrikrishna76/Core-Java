package com.exams;
/*
 * Create an abstract class MotorVehicle with the following details: Data Members: (a) 
modelName (b)modelNumber (c) modelPrice Methods: (a) display() to show all the details 
Create a subclass of this class Carthat inherits the class MotorVehicle and add the following 
TEST-OOPS
details: Data Members: (b) discountRate Methods: (a) display() method to display the Car 
name, model number, price and the discount rate. (b) discount() method to compute the 
discount
 */

abstract class MotorVehicle {
    protected String modelName;
    protected String modelNumber;
    protected double modelPrice;

    // Constructor
    public MotorVehicle(String modelName, String modelNumber, double modelPrice)
    {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }

    // Abstract method to be implemented in subclasses
    abstract void display();
}

// Subclass Car
class Car1 extends MotorVehicle
{
    private double discountRate;

    // Constructor
    public Car1(String modelName, String modelNumber, double modelPrice, double discountRate) 
    {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
    }

    // Method to calculate the discount
    public double discount() 
    {
        return modelPrice * (discountRate / 100);
    }

    // Method to display car details with discount
    @Override
    void display() 
    {
        System.out.println("Car Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Model Price: " + modelPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Discount Amount: " + discount());
        System.out.println("Final Price: " + (modelPrice - discount()));
    }
}


public class Abstractclass1 
{

	public static void main(String[] args) 
	{
		Car1 c = new Car1("Tesla Model S", "TS001", 85000.0, 10.0);

        
        c.display();

	}

}
