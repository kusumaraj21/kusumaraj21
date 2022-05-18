package tns.com.lambdaexpression;

import java.util.LinkedList;

//L.E. using collections
public class Example4 {

	public static void main(String[] args) {
		LinkedList<Integer>obj=new LinkedList<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		obj.add(60);
		//System.out.println(obj);
		obj.forEach((itr)->
		{
			System.out.println(itr);
		});
	}

}