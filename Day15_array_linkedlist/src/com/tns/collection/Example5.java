package com.tns.collection;

import java.util.Vector;

public class Example5 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Vector v=new Vector () ;
		v.add (0,"Kyle") ;
		v.add (1, 21) ;
		v.add (2, 65.55) ;
		System.out.println(v) ;
		v.setElementAt(25,1);//here 1st parameter belongs to new element and 2nd parameter is belong to index
		System.out.println(v) ;

	}

}
