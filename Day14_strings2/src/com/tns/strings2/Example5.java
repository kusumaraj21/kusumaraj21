package com.tns.strings2;

import java.util.StringTokenizer;

public class Example5 {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("JAVA:Code:String", ":",true);
		while(st.hasMoreTokens()) {
		System.out.println(st.nextToken());
		}

	}

}