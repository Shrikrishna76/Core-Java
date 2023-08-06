package com.exams;
/*
 * Create a class called Time, which has three private instance variables – hour, min and sec. It 
contains a method called add( ) which takes one Time object as parameter and print the 
added value of the calling Time object and passes Time object. In the main method, declare 
two Time objects and assign values using constructor and call the add() method.
 */

 class Time 
{
    private int hour;
    private int min;
    private int sec;

    
    public Time(int hour, int min, int sec)
    {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

   
    public void add(Time ot)
    {
        sec += ot.sec;
        min += ot.min;
        hour += ot.hour;

        
        if (sec >= 60) 
        {
            min += sec / 60;
            sec = sec % 60;
        }
        if (min >= 60) 
        {
            hour += min / 60;
            min = min % 60;
        }
    }

   
    public void displayTime() 
    {
        System.out.println(hour+" Hour :"+min+" min :"+sec+" sec" );
    }

   
}

public class Timeclass {

	public static void main(String[] args) {
		
		 Time to = new Time(2, 30, 45);
	        Time t1 = new Time(1, 15, 20);

	        
	        System.out.println("Time1:");
	        to.displayTime();
	        System.out.println("Time2:");
	        t1.displayTime();

	        to.add(t1);

	        
	        System.out.println("Time1 + Time2:");
	        to.displayTime();
	}

}
