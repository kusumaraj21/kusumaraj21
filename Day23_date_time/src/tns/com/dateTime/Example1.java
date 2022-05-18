package tns.com.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Example1 {

	public static void main(String[] args) {
		 
		//LocalDate d=new LocalDateTime.now();;
		//LocalDate d1=new LocalTime.now();
		LocalDateTime obj= 	LocalDateTime.now();
		LocalDate obj2=LocalDate.of(2022, 2, 2);
		//System.out.println(d);
		//System.out.println(d1);
		System.out.println(obj);
		System.out.println(obj2);
	}

}