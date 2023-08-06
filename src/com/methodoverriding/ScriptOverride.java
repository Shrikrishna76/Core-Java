package com.methodoverriding;
/*
 * WAP to create class Person with method readScript().create class Actor which extends Person implement readScript() 
 * differently in child.
 */
class Person 
{
    public void readScript() 
    {
        System.out.println("Person: Reading script");
    }
}


class Actor extends Person
{
    @Override
    public void readScript() 
    {
        System.out.println("Actor: Reading Script");
    }
}



public class ScriptOverride 
{

	public static void main(String[] args) 
	{
		 Person person = new Person();
	        person.readScript();

	        Actor actor = new Actor();
	        actor.readScript();

	}

}
