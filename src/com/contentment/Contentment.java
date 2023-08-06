
package com.contentment;
/*
WAP to use containment for following hierarchy. Fill all data and print all
data: (id is a integer number, name is a String)
Class Institute
id
name
Branch
id
name
Subject
id
name
Topic
id
name
SubTopic
id
name
Question
id
name*/

class Institute
{
	private int id;
	private String name;
	private Branch br;
	private Subject su;
	private Topic t;
	private SubTopic st;
	private Question q;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setBr(Branch br)
	{
		this.br=br;
	}
	
	public void setSu(Subject su)
	{
		this.su=su;
	}
	
	public void setT(Topic t)
	{
		this.t=t;
	}
	
	public void setSt(SubTopic st)
	{
		this.st=st;
	}
	
	public void setQ(Question q)
	{
		this.q=q;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Branch getBr()
	{
		return br;
	}
	
	public Subject getSu()
	{
		return su;
	}

	public Topic getT()
	{
		return t;
	}
	public SubTopic getSt()
	{
		return st;
	}
	public Question getQ()
	{
		return q;
	}
}

class Branch
{
	private int id;
	private String name;
	
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	
}

class Subject
{
	private int id;
	private String name;
	
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
}

class Topic
{
	private int id;
	private String name;
	
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	
}

class SubTopic
{
	private int id;
	private String name;
	
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	
}

class Question
{
	private int id;
	private String name;
	 
	
	public void setId(int id)
	{
		
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
}
public class Contentment {

	public static void main(String[] args) {
		Institute i=new Institute();
		i.setId(01);
		i.setName("AAAA");
		i.setBr(new Branch());
		i.getBr().setId(12);
		i.getBr().setName("bbbb");
		i.setSu(new Subject());
		i.getSu().setId(13);
		i.getSu().setName("Java");
		i.setT(new Topic());
		i.getT().setId(14);
		i.getT().setName("Contentment");
		i.setSt(new SubTopic());
		i.getSt().setId(15);
		i.getSt().setName("Hierachical Contentment");
		i.setQ(new Question());
		i.getQ().setId(16);
		i.getQ().setName("NNN");
		
		System.out.println("Institute Id: "+i.getId());
		System.out.println("Institute Name: "+i.getName());
		
		System.out.print("Branch Id:"+i.getBr().getId());
		System.out.println("Branch Name: "+i.getBr().getName());
		
		System.out.println("Subject Id: "+i.getSu().getId());
		System.out.println("Subject Name: "+i.getSu().getName());
		
		System.out.println("Topic Id: "+i.getT().getId());
		System.out.println("Topic Name: "+i.getT().getName());
		
		System.out.println("Sub Topic Id: "+i.getSt().getId());
		System.out.println("Sub Topic Name: "+i.getSt().getName());
		
		System.out.println("Question Id; "+i.getQ().getId());
		System.out.println("Question Name: "+i.getQ().getName());
		
		
		
		

	}

}
