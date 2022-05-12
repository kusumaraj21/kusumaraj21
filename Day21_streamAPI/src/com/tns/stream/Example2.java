package com.tns.stream;

import java.util.Arrays;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<Integer>Num=Arrays.asList(10,10,44,20,34,30,20,30,44,75,87,5);
		//distinct method
		Num.stream().distinct().forEach(System.out::println);
		System.out.println("Distinct");
		//limit method
		Num.stream().limit(4).forEach(System.out::println);
		System.out.println("skip Output: ");
		//skip method
		Num.stream().skip(5).forEach(System.out::println);
		//sorted method
		System.out.println("Sort Output: ");
		Num.stream().sorted().forEach(System.out::println);
	}

}