package com.methodoverriding;
/*
 * WAP to create class Bike with fields color ,speed and  method bikeInfo() which is show color and speed of bike .create class
 *  Pulsar which extends Bike implement bikeInfo() differently child 
 */

class Bike {
    String color;
    int speed;

    public Bike(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public void bikeInfo() {
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }
}


class Pulsar extends Bike {
    public Pulsar(String color, int speed)
    {
        super(color, speed);
    }

    @Override
    public void bikeInfo() {
        System.out.println("Pulsar Details:");
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }
}


public class MethodOverridingBike {

	public static void main(String[] args) {
		Bike myBike = new Bike("Red", 60);
        myBike.bikeInfo();

       

        Pulsar myPulsar = new Pulsar("Black", 80);
        myPulsar.bikeInfo();
	}

}
