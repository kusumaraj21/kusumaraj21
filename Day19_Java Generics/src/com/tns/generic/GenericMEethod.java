package com.tns.generic;


public class GenericMEethod 
{
	public static <E>void display(E[] arr)
	{ 
		for (E itr:arr)
		{
			System.out.println(itr);
			
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		Integer[] intArray= {10,20,30,40,50};
		Character[] c= {'a', 'b','c', 'd','e', 'f'};
		display(intArray);
		display(c);
		
	}

}