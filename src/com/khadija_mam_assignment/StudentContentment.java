package com.khadija_mam_assignment;

class Course
{
	private int cid;
	private String cname;
	
	public void setCid(int cid)
	{
		this.cid=cid;
	}
	
	public void setCname(String cname)
	{
		this.cname=cname;
	}
	
	public int getCid()
	{
		return cid;
	}
	
	public String getCname()
	{
		return cname;
	}
}

public class StudentContentment {
	
	private int sid;
	private String sname;
	 Course c;
	 
	 public void setSid(int sid)
	 {
		 this.sid=sid;
	 }
	 
	 public void setSName(String sname)
	 {
		 this.sname=sname;
	 }
	 
	 public void setC(Course c)
	 {
		 this.c=c;
	 }
	 
	 public int getSid()
	 {
		 return sid;
	 }
	 
	 public String getSname()
	 {
		 return sname;
	 }
	 
	 public Course getC()
	 {
		 return c;
	 }
	 public static void main(String[] args) 
	  {	
		 
		StudentContentment c=new StudentContentment();
		c.setSid(11);
		c.setSName("karan");
		c.setC(new Course());
		c.getC().setCid(12);
		c.getC().setCname("jajja");
		
		System.out.println("Student Id: "+c.getSid());
		System.out.println("Student Name: "+c.getSname());
		System.out.println("Course Nmae: "+c.getC().getCname());
		System.out.println("Course Id: "+c.getC().getCid());
	}

}
