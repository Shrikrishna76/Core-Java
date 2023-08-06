package lab_30_07_23.model;

public class Person {
	protected int id;
	protected String name;
	
	public Person(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
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
	
	public String toString(int id,String name)
	{
		return "id ,name";
	}

}
