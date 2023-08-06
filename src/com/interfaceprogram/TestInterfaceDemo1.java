package com.interfaceprogram;

interface Printable{
	
	int a=10;
	//Interfaces cannot have constructors
	/*Printable(){
		
	}
	*/
	void showMsg();//by default public and abstract
}

class Print implements Printable{
	
	
	public void showMsg() {
		System.out.println("printing msg");
	}
}
public class TestInterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Print p=new Print();
		p.showMsg();
		
		//Printable p2=new Printable(); //CE-can not create instance
		Printable p1=new Print();
		p1.showMsg();
	}

}
