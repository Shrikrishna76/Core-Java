package com.methodoverriding;
/*
 * WAP to create class Vehicle with methods accelerate(long mph) with long type parameter ,stop(),run() all method return string 
 * type of value. Create class car which extends Vehicle implement accelerate(long mph)differently in car class.
 */

class Vehicle 
{
    public String accelerate(long mph)
    {
        return "Vehicle is accelerating at " + mph + " mph.";
    }

    public String stop() {
        return "Vehicle has stopped.";
    }

    public String run() {
        return "Vehicle is running.";
    }
}

class Car extends Vehicle {
    @Override
    public String accelerate(long mph) {
        return "Car is accelerating at " + mph + " mph.";
    }
}


       
   

public class MethodOverrideVehicle {

	public static void main(String[] args) {
		 Vehicle vehicle = new Vehicle();
	        System.out.println(vehicle.accelerate(60));
	        System.out.println(vehicle.stop());
	        System.out.println(vehicle.run());

	        Car car = new Car();
	        System.out.println(car.accelerate(80));
	        System.out.println(car.stop());
	        System.out.println(car.run());

	}

}
