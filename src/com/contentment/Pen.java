package com.contentment;
	
	class pen1
	{
		String brand;
		String color;
		int price;
		
		public  pen1(String brand, String color, int price)
		{
			this.brand=brand;
			this.color=color;
			this.price=price;
		}
		
		public void Show()
		{
			System.out.println("   Brand Name : "+brand+"   Pen Color : "+color+"   Pen Price : "+price);
		}
		
//		public String toString()
//		{
//			return "Pen Brand Name: "+brand+"   Pen Color: "+color+"   Pen Price: "+price; 
//		}
	}

	class Bag
	{
		String brand;
		int price;
		String color;
		pen1 p;
		
		public Bag(String brand, int price, String color, pen1 p)
		{
			this.brand=brand;
			this.price=price;
			this.color=color;
			this.p=p;
		}
		
		public void show()
		{
			System.out.print("Bag Brand Name : "+brand+"   Bag price : "+price+"   Bag color : "+color+"Pen : "   +p);
		}
		
//		public String toString()
//		{
//			return "   Bag Brand Name:"+brand+"   Bag Price: "+price+"   Bag color: "+color+" "+p;
//		}
	}

	public class Pen {
		

		public static void main(String[] args) {
			
//			pen p=new pen("Reynolds", "Blue", 50);
//			Bag b=new Bag("Skybag", 500, "Red", p);
			
			//System.out.println(b);
			
			Bag b=new Bag("SkyBag", 500, "Red", new pen1("Reynolds","blue",50));
			
			b.show();
		}

	


}
