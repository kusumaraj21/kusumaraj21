package com.tns.collection;

import java.util.ArrayList;
import java.util.Vector;

public class Example7 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();

		arr.add(3);

		arr.add("Methods");

		arr.add("Java");

		arr.add(4);

		Vector v = new Vector();

		v.addAll(arr);

		System.out.println(v);

	}

}