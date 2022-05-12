package com.tns.generic;


import java.util.LinkedList;

public class Example2 {
//no need type cast in generic method
	public static void main(String[] args) {
		LinkedList<String> L=new LinkedList<String>();
		L.add("Hello");
		L.add("World!");
		String res=L.get(1);
		
		System.out.print(res);
		
	}

}