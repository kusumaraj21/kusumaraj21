package Junittesting;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class JUnitTesting5 {
	@Test
	void accept()
	{
		System.setProperty("1","Umesh");
		Assumptions.assumeFalse("Umesh".equals(System.getProperty("2")));
	}

}