package Junittesting;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class JUnitTesting4 
{
	@AfterAll
	
	static void display ()
	{
	 System.out.println("Umesh");
	}
	
	@Test
 	void display1()
	{
	 System.out.println("Rohit");
	}
}