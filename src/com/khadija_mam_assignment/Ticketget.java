package com.khadija_mam_assignment;

import java.util.Scanner;

public class Ticketget {

	 public static void main(String args[]) 
	    {
		 	Ticket t = new Ticket();
	        Ticket t1 = new Ticket();
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter no of bookings: ");
	        int bookings = sc.nextInt();
	        System.out.print("Enter the available tickets: ");
	        int availableTickets = sc.nextInt();
	        t.setAvailableTickets(availableTickets);

	        for (int i = 0; i < bookings; i++)
	        {
	        	
	        	
	            
	        System.out.print("Enter the ticketid: ");
	        int ticketid = sc.nextInt();
	        t.setTicketid(ticketid);
	        System.out.print("Enter the price: ");
	        int price = sc.nextInt();
	        t.setPrice(price);
	        System.out.print("Enter the no of tickets: ");
	        int noOfTickets = sc.nextInt();
	        System.out.println("Available tickets: " + Ticket.getAvailableTickets());

	        int totalAmount = t.calculateTicketCost(noOfTickets);
	        if (totalAmount != -1)
	        {
	            System.out.println("\nTotal amount: " + totalAmount);
	            System.out.println("Available tickets after booking: " + Ticket.getAvailableTickets());
	        }
	        }

	        System.out.println();
	        sc.close();

	    }
	
}
