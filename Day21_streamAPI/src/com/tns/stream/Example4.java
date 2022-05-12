package com.tns.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {

	public static void main(String[] args) {
		//Map Method
		List<Integer>Num=Arrays.asList(10,20,30,44,75,87,5);
		List<Integer>Num1=Num.stream().map(itr->itr*2).collect(Collectors.toList());
		System.out.println(Num1);

	}

}