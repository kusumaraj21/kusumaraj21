package tns.com.dateTime;

import java.time.ZoneId;

public class Example6 {

	public static void main(String[] args) {
	for(String s:ZoneId.getAvailableZoneIds())
              {
	                   System.out.println(s);
                 }
	}

}