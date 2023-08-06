package com.kalyani_mam_lab;

public class AccessModifier {
	
	private int id=1;
	String name="karan";
	protected int age=21;
	public String m_status="Unmarried";

	private void doprivate()
	{
		System.out.println("Id:"+id);
	}
	
	void dodefault()
	{
		System.out.println("Name:"+name);
	}
	
	protected void doprotected()
	{
		System.out.println("Age"+age);
	}
	
	public void dopublic()
	{
		System.out.println("Marrage Status:"+m_status);
	}
	
	
	public static void main(String[] args) {
		
		AccessModifier am=new AccessModifier();
		
		am.doprivate();
		am.dodefault();
		am.doprotected();
		am.dopublic();
		
	}

}
