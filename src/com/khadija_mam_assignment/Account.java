package com.khadija_mam_assignment;

import java.util.Scanner;



/*
 
 * Create a class Account containing following methods -
insert () to insert account data
display () to display account information
deposit () to deposit amount
withdraw () to withdraw amount
check_balance() to check balance
 
 */

public class Account {
	
	 String name;
     int accNo;  
     double balance;
     double amount;
     double currentbalance;
     double currentbalance1;
     
    
    
    
    public void insert(String name, int accNo, double balance)
    {   
       this.name = name;
        this.accNo =accNo;
        this.balance = balance;
        
    }
    
    
    public void display()
    {
    	System.out.println("Your  Name:"+name);
    	System.out.println("Your  Account No:"+accNo);
    	System.out.println("Your  balance:"+balance);
    	
    	
    }
    
   
   
    public void deposit(double amount) {
    	 currentbalance =balance+ amount;
         System.out.println("Your Total amount: "+ currentbalance);
     }
    
        
    
    public void withdraw(double amount1) {
        if (this.balance >= amount1) { 
            currentbalance1 =balance- amount1;
            System.out.println("Your remainig amount: "+ currentbalance1);
        }
        else { 
            System.out.println("Your balance is not sufficent.");
        }
    }
    
    
   
    public double checkbalance() {
        return balance;
        
        
    }
    
    public static void main(String[] args){
        
        
       
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Name:");
        String name=sc.next();
        
        System.out.print("Enter Account No:");
        int accNo=sc.nextInt();
        
        System.out.print("Enter balance:");
        double balance=sc.nextDouble();
        
        Account a = new Account(); 
        a.insert(name, accNo, balance);
        a.display();
        
        System.out.print("Enter amount to deposite:");
        double amount=sc.nextDouble();
        a.deposit(amount);
        
        System.out.print("Enter amount to withdraw");
        double amount1=sc.nextDouble();
        a.withdraw(amount1);
        
        System.out.println("Balance:"+balance);
        sc.close();
        
        
        
       
                                
    }

}


