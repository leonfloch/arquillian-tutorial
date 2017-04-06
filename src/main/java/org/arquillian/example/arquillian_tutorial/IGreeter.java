package org.arquillian.example.arquillian_tutorial;

import java.io.PrintStream;

import javax.ejb.Local;

@Local
public interface IGreeter {
	
	public void greet(PrintStream to, String name);
      
    public String createGreeting(String name);

}
