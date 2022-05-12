package com.tns.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example3 {

	public static void main(String[] args) {
		List<Integer>Num=Arrays.asList(10,44,34,30);
		
		Optional<Integer>Num1=Num.stream().reduce((a,b)->(a*b));
		if(Num1.isPresent())
		{
			System.out.println("Result: "+Num1.get());
		}
	}

}