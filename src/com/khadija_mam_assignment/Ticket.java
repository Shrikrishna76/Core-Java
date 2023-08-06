package com.khadija_mam_assignment;

public class Ticket {

	private int ticketid;
    private int price;
    private static int availableTickets;
   

    public void setTicketid(int ticketid) 
    {
        this.ticketid = ticketid;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }

    public static void setAvailableTickets(int availableTickets) 
    {
        if (availableTickets >= 0) 
        {
            Ticket.availableTickets = availableTickets;
        }
        else
        {
            System.out.println("Invalid number of available tickets.");
        }
    }

    public int getTicketid() 
    {
        return ticketid;
    }

    public int getPrice() 
    {
        return price;
    }

    public static int getAvailableTickets() 
    {
        return availableTickets;
    }

    public int calculateTicketCost(int noOfTickets)
    {
        if (noOfTickets <= availableTickets)
        {
            availableTickets -= noOfTickets;
            return noOfTickets * price;
        } 
        else
        {
            System.out.println("Tickets not available.");
            return -1;
        }
    }

   
}
