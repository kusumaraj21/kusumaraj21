package com.tns.generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example4 {

	public static void main(String[] args) {
		Map<Integer,Integer> M=new HashMap<Integer,Integer>();
		M.put(1, 333);
		M.put(2, 444);
		System.out.println(M);
		Set<Entry<Integer, Integer>>ME1=M.entrySet();
		Iterator<Map.Entry<Integer,Integer>>itr=ME1.iterator();
		while(itr.hasNext()) 
		{
			@SuppressWarnings("rawtypes")
			Map.Entry ME2= itr.next();
			System.out.println(ME2.getKey()+" "+ME2.getValue());
		}
		
	}

}