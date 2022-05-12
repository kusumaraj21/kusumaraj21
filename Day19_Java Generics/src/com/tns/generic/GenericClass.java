package com.tns.generic;

public class GenericClass<T> {
	T val;
	T val1;
	void print()
	{
		System.out.println(val.getClass());
	}

	public static void main(String[] args) {
		GenericClass<Integer> obj=new GenericClass<>();
		GenericClass<String> obj1=new GenericClass<>();
		obj.val=25;
		obj1.val="XYZ";
		obj.print();
		obj1.print();
		

	}
}