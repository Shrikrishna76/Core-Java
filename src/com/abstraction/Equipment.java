package com.abstraction;

abstract class Equipmentclass {
    // Implemented method
    void fill() {
        System.out.println("Equipment is filled.");
    }

    // Abstract method
    abstract void mix();
}

class Cement_mixer extends Equipmentclass {
    @Override
    void mix() {
        System.out.println("Cement is being mixed.");
    }

    void pour() {
        System.out.println("Cement is being poured.");
    }
}

public class Equipment {
	 public static void main(String[] args) {
	        
	        Cement_mixer cm = new Cement_mixer();
	        cm.fill();
	        cm.mix();
	        cm.pour();


	        Equipmentclass e = new Cement_mixer();

	        // Check the methods available to e.
	        e.fill();
	        e.mix();

	     
	    }

}
