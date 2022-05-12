package com.tns.stream;

import java.util.Arrays;
import java.util.List;

public class Example1 {

	public static void main(String[] args) 
	{
	List<Integer>Num=Arrays.asList(10,20,30,44,75,87,5);
	Num.stream().filter(n->n>15).forEach(n->System.out.println(n));
	//filter method
	}

}