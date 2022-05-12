package com.tns.generic;

import java.util.ArrayList;
public class Example1 {
	//Generics 

	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<String>();//type safety
		a.add("Type Safety");
		a.add("1");
		a.add("52.5");
		
		System.out.println(a);
		

	}

}