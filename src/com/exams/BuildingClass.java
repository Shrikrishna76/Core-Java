package com.exams;
/*
 * Create a base class Building that stores the number of floors of a building, number of rooms 
and it’s total footage. Create a derived class House that inherits Building and also stores the 
number of bedrooms and bathrooms. Demonstrate the working of the classes. create a 
second derived class Office that inherits Building and stores the number of telephones and 
tables. Now demonstrate the working of all three classes
 */

class Building 
{
    private int numFloors;
    private int numRooms;
    private double totalFootage;

    public Building(int numFloors, int numRooms, double totalFootage)
    {
        this.numFloors = numFloors;
        this.numRooms = numRooms;
        this.totalFootage = totalFootage;
    }
    
  

    public int getNumFloors() 
    {
        return numFloors;
    }

    public int getNumRooms()
    {
        return numRooms;
    }

    public double getTotalFootage()
    {
        return totalFootage;
    }
}


class House extends Building {
    private int numBedrooms;
    private int numBathrooms;

    public House(int numFloors, int numRooms, double totalFootage, int numBedrooms, int numBathrooms) 
    {
        super(numFloors, numRooms, totalFootage);
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
    }
    
   

    public int getNumBedrooms() 
    {
        return numBedrooms;
    }

    public int getNumBathrooms() 
    {
        return numBathrooms;
    }
}


class Office extends Building {
    private int numTelephones;
    private int numTables;

    public Office(int numFloors, int numRooms, double totalFootage, int numTelephones, int numTables)
    {
        super(numFloors, numRooms, totalFootage);
        this.numTelephones = numTelephones;
        this.numTables = numTables;
    }

    public int getNumTelephones() 
    {
        return numTelephones;
    }

    public int getNumTables() 
    {
        return numTables;
    }
}


public class BuildingClass {

	public static void main(String[] args) {
		
		 Building b = new Building(3, 10, 2000.0);
	        System.out.println("Building Details:");
	        System.out.println("Floors: " + b.getNumFloors());
	        System.out.println("Rooms: " + b.getNumRooms());
	        System.out.println("Total Footage: " + b.getTotalFootage() + " sq. ft.");

	        // Create a House
	        House h = new House(2, 5, 1500.0, 3, 2);
	        System.out.println("\nHouse Details:");
	        System.out.println("Floors: " + h.getNumFloors());
	        System.out.println("Rooms: " + h.getNumRooms());
	        System.out.println("Total Footage: " + h.getTotalFootage() + " sq. ft.");
	        System.out.println("Bedrooms: " + h.getNumBedrooms());
	        System.out.println("Bathrooms: " + h.getNumBathrooms());

	        // Create an Office
	        Office o = new Office(5, 15, 3000.0, 20, 30);
	        System.out.println("\nOffice Details:");
	        System.out.println("Floors: " + o.getNumFloors());
	        System.out.println("Rooms: " + o.getNumRooms());
	        System.out.println("Total Footage: " + o.getTotalFootage() + " sq. ft.");
	        System.out.println("Telephones: " + o.getNumTelephones());
	        System.out.println("Tables: " + o.getNumTables());
	
	}

}
