package com.tns.collection;

import java.util.ArrayList;

public class Example3 {

	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList<>();
		Object clone1;
		a.add("abc");
		a.add("xyz");
		a.add(5);
		System.out.println(a);
		clone1=a.clone(); //clone method
		System.out.println(clone1);

	}

}
