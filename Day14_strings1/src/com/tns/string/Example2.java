package com.tns.string;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String i1=new String(s.nextLine());
		String i2=new String(s.nextLine());
		System.out.println(i1.equals(i2));
		s.close();

	}

}
