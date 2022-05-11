package com.tns.collection;

import java.util.Stack;

public class Example6 {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>() ;
		s.add(10) ;
		s.add(20) ;
		s.add(30) ;
		System.out.println(s) ;
		s.pop() ;
		//s.pop() ;
		System.out.println(s) ;
	}

}