package com.oops;


	public class Cars {

		int modelnumber;
		String name;
		int price;
		
		public void acceptdetails(int mn, String n, int p)
		{
			modelnumber=mn;
			name=n;
			price=p;
		}
		
		public void display()
		{
			System.out.println("Model Number:"+modelnumber+" Car name:"+name+" car price:"+price);
		}
		
		
		public static void main(String[] args) {
			
			Cars c1=new Cars();
			c1.acceptdetails(01,"Maroti Suzuki",700000);
			c1.display();
			
			Cars c2=new Cars();
			c2.acceptdetails(02,"Hyundai",1200000);
			c2.display();
			
			Cars c3=new Cars();
			c3.acceptdetails(03,"Tata motar",900000);
			c3.display();
			
			
			
		}

	}

