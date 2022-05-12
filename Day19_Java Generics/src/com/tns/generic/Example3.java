package com.tns.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Example3 {

	public static void main(String[] args) {
		ArrayList<String> L=new ArrayList<String>();
		L.add("X");
		L.add("Y");
		
		String s=L.get(1);
		System.out.println("Element is: "+s);
		System.out.println(L);
		
		Iterator<String>itr=L.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}