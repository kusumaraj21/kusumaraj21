package com.tns.collection;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();//import that ArrayList package
		//System.out.println(l.isEmpty()); //for empty method
		l.add(1);
		l.add(3);
		l.add(5);
		l.add(12);
		l.add(1);
		System.out.println(l);
		System.out.println(l.size());//size method
		System.out.println(l.contains(15));//contain method
		System.out.println(l.indexOf(1));//Index of method
		System.out.println(l.lastIndexOf(1));//Last index of method
		System.out.println(l.get(2));//get method
		l.set(4, 23);//set method is use to change element of that index
		System.out.println(l);
		System.out.println(l.isEmpty());//isEmpty method it will give boolean output
		
	

	}

}