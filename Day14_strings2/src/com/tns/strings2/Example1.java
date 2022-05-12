package com.tns.strings2;


import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuffer sb=new StringBuffer(s.nextLine());
		System.out.println(sb.capacity());//null=16 
		//and for spaces=1+length of string
		//capacity method use for calculating the length of string
		s.close();
	}

}